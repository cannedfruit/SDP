package cw_one

import cw_one.Instructions._

/*
 * The translator of a <b>S</b><b>M</b>al<b>L</b> program.
 */
class Translator(fileName: String) {

  // word + line is the part of the current line that's not yet processed
  // word has no whitespace
  // If word and line are not empty, line begins with whitespace

  /**
    * translate the small program in the file into lab (the labels) and prog (the program)
    */
  def readAndTranslate(m: Machine): Machine = {
    val labels = m.labels
    var program = m.prog
    import scala.io.Source
    val lines = Source.fromFile(fileName).getLines
    val instructionFactory = InstructionFactory



    for (line <- lines) {
      val fields = line.split(" ")
      if (fields.nonEmpty) {
        labels.add(fields(0))
        val opCode = fields(1)
        //call factory method to return desired class
        val instruction = instructionFactory.getInstruction(opCode)
        //find companion object apply method
        val apply = instruction.getMethods.find(m => m.getName == "apply").get
        //convert possible number parameters
        val params = fields.filter(f=> fields.indexOf(f) != 1)
          .map(f => try{
          f.toInt.asInstanceOf[Object]
        }catch{
          case nfe: NumberFormatException=> f
        })

        //add instruction to program list
        try {
          program = program :+ apply.invoke(instruction, params:_*).asInstanceOf[Instruction]
        }catch {
          case iae: IllegalArgumentException => println("FAILED " + instruction.getName)
            println(params.foreach(n=> println(n)))

        }
      }
    }
    new Machine(labels, program)
  }
}

object Translator {
  def apply(file: String) =
    new Translator(file)
}
