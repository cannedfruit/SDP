package cw_one.Instructions

import cw_one.Machine

/**
  * This class ....
  *
  * @author Sarah Connor
  */
class LinInstruction(label: String, opcode: String, register: Int, value: Int) extends Instruction(label, opcode) {

  override def execute(m: Machine) = {
    if(!isLastInstruction) m.regs(register) = value
    if((m.prog.length - 1) == m.labels.labels.indexOf(label)) IsOverFlag.isLastInstruction = true
  }

  override def toString: String = {
    super.toString + " register " + register + " value is " + value + "\n"
  }
}

object LinInstruction {
  def apply(label: String, register: Int, value: Int) =
    new LinInstruction(label, "lin", register, value)
}
