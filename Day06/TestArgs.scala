package Day06

import atomicscala.AtomicTest._

object TestArgs extends App {
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4
  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3
}

class Family(members: String*) {
  def familySize(): Int ={
    members.length
  }
}

