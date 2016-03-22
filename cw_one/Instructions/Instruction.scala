package cw_one.Instructions

import cw_one.Machine

/**
  * This class is the supertype for machine instructions
  *
  * @author Sarah Connor
  */
abstract class Instruction(label: String, opcode: String) {

  /**
    * method to dynamically determine the end of program
    * @return Boolean flag signalling end of program
    */
  def isLastInstruction :Boolean =  IsOverFlag.isLastInstruction

  override def toString: String = label + ": " + opcode

  def execute(m: Machine): Unit

  /**
    * sets the boolean flag IsOverFlag
    * @param m Machine is executing the Instruction
    */
  def setIsOverFlag(m: Machine) ={
    val numOfLabels = m.labels.labels.size - 1
    val instructionIndex = m.prog.indexWhere((instruction) => instruction.toString().contains(label))
    if(numOfLabels == instructionIndex){
      IsOverFlag.isLastInstruction = true
    }
  }
}
