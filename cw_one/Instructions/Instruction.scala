package cw_one.Instructions

import cw_one.Machine

/**
  * This class is the supertype for machine instructions
  *
  * @author Sarah Connor
  */
abstract class Instruction(label: String, opcode: String) {

  var isLastInstruction :Boolean = _

  override def toString: String = label + ": " + opcode

  def execute(m: Machine): Unit

  //use type classes, implicit so says Keith
  def exitAtEnd(m: Machine) ={
    val numOfLabels = m.labels.labels.size - 1
    val instructionIndex = m.prog.indexWhere((instruction) => instruction.toString().contains(label))
    if(numOfLabels == instructionIndex){
      System.exit(0)
    }
  }
}
