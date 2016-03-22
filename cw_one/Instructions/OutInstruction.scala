package cw_one.Instructions

import cw_one.Machine

/**
  * Prints the specified Register to the console
  * Created by Sarah on 2/21/2016.
  */
class OutInstruction (label: String, op: String, val register: Int)  extends Instruction(label, op){

//  var isLastInstruction : Boolean =_

  override def execute(m: Machine) = {
    if(!isLastInstruction) println("Register " + register + " contains " + m.regs(register))
    isLastInstruction = (m.prog.length - 1) == m.labels.labels.indexOf(label)
  }


  override def toString: String = {
    super.toString + " register " + register + "\n"
  }
}

object OutInstruction {
  def apply(label: String, register: Int) =
    new OutInstruction(label, "out", register)
}
