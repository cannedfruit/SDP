package cw_one.Instructions

/**
  * Created by Sarah on 2/24/2016.
  */
object InstructionFactory{
  private final val ADD = "add"
  private final val SUB = "sub"
  private final val MUL = "mul"
  private final val DIV = "div"
  private final val OUT = "out"
  private final val LIN = "lin"
  private final val BNZ = "bnz"

  def getInstruction(opCode: String) = {
    opCode match {
      case ADD =>
       AddInstruction
      case SUB =>
        SubInstruction
      case MUL =>
        MulInstruction
      case DIV =>
        DivInstruction
      case OUT =>
        OutInstruction
      case LIN =>
        LinInstruction
      case BNZ =>
        BnzInstruction
      case x =>
        println(s"Unknown instruction $x")

    }
  }
}

