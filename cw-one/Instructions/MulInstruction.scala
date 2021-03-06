package cw_one.Instructions

import cw_one.Machine

/**
  * Executes the multiplication instruction
  *
  * @author Sarah Connor
  */

class MulInstruction(label: String, op: String, val result: Int, val op1: Int, val op2: Int)
  extends Instruction(label, op) {

  override def execute(m: Machine) {
    if(!isLastInstruction) {
      val value1 = m.regs(op1)
      val value2 = m.regs(op2)
      m.regs(result) = value1 * value2
    }
    setIsOverFlag(m)
  }

  override def toString: String = {
    super.toString + " " + op1 + " x " + op2 + " to " + result + "\n"
  }
}

object MulInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int) =
    new MulInstruction(label, "mul", result, op1, op2)
}

