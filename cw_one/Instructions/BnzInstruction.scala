package cw_one.Instructions

import cw_one.Machine

/**
  * This class goes to the statement labeled if the contents of the register specified is not zero
  *
  * @author Sarah Connor
  */
class BnzInstruction(label: String, opcode: String, register: Int, statement: String)
  extends Instruction(label, opcode) {


  override def execute(m: Machine) = {
    if(m.regs(register) != 0) {
      if (!isLastInstruction) {
        m.execute(m.prog.indexWhere((instruction) => instruction.toString().contains(statement)))
      }
    }
    if((m.prog.length - 1) == m.labels.labels.indexOf(label)) IsOverFlag.isLastInstruction = true
  }

  override def toString: String = {
    super.toString + " if  register " + register + " is not 0, execute " + statement + "\n"
  }
}

object BnzInstruction {
  def apply(label: String, register: Int, statement: String) =
    new BnzInstruction(label, "bnz", register, statement)
}
