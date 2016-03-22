package cw_one.Instructions

import cw_one.Machine

/**
  * Created by Keith Mannock
  * Executes the addition instruction
  *
  * @author Sarah Connor
  */

class AddInstruction(label: String, op: String, val result: Int, val op1: Int, val op2: Int)
  extends Instruction(label, op) {

 // var isLastInstruction : Boolean =_

  override def execute(m: Machine) {
    if(!isLastInstruction) {
      val value1 = m.regs(op1)
      val value2 = m.regs(op2)
      m.regs(result) = value1 + value2
    }
    isLastInstruction = (m.prog.length - 1) == m.labels.labels.indexOf(label)
  }

  override def toString: String = {
    super.toString + " " + op1 + " + " + op2 + " to " + result + "\n"
  }
}

object AddInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int) =
    new AddInstruction(label, "add", result, op1, op2)
}
