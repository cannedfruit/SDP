package cw_one.Instructions

/**
  * Created by Sarah on 2/24/2016.
  */
object InstructionFactory{

  def getInstruction(opCode: String):Class[_] = {
    val classname = "cw_one.Instructions." + opCode.capitalize + "Instruction"
    Class.forName(classname)
  }
}

