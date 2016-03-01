package cw_one.Instructions

import cw_one.Machine

/**
  * This class is the supertype for machine instructions
  *
  * @author Sarah Connor
  */
abstract class Instruction(label: String, opcode: String) {

  override def toString(): String = label + ": " + opcode

  def execute(m: Machine): Unit

  //use type classes, implicit so says Keith

}
