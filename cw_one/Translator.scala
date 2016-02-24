package cw_one

import java.lang.Class
import java.lang.reflect.Constructor

import cw_one.Instructions._

import scala.reflect.runtime.universe._
import scala.reflect.runtime.{universe=>ru}

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
        val instruction = instructionFactory.getInstruction(fields(1))
        val removedOp = fields.filter(f=> fields.indexOf(f) != 1)
        val apply = instruction.getClass.getMethods.find(m => m.getName == "apply").get
        val params = new Array[Object] (removedOp.length)
        for(i <- removedOp.indices){
          val field:Object = removedOp(i)
          try{
            params(i) = removedOp(i).toInt.asInstanceOf[Object]
          }catch{
            case nfe: NumberFormatException=>{params(i) = field}
          }
        }

        try {
           program = program :+ apply.invoke(instruction, params:_*).asInstanceOf[Instruction]
        }catch {
          case iae: IllegalArgumentException => {println("FAILED " + instruction.getClass.getName)
          println(params.foreach(n=> println(n)))}

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
