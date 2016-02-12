package Day06

import atomicscala.AtomicTest._

/*
Class Arguments (3-5)
 */
object TestArgs extends App {
  println("3. & 4.")
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4
  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3
  val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick")
  family3.familySize() is 4
  val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
  family4.familySize() is 3

  //5.
  println("\n5.")
  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21


  def squareThem(num: Int*): Int = {
    var sum = 0
    num.foreach(num => sum += (num * num))
    sum
  }

  //6.
  println("\n6.")
  val t = new SimpleTime(hours=5, minutes=30)
  t.hours is 5
  t.minutes is 30
  val t2 = new SimpleTime(hours=10)
  t2.hours is 10
  t2.minutes is 0


}

class Family(members: String*) {
  def familySize(): Int ={
    members.length
  }
}

class FlexibleFamily(mom: String, dad: String, children: String*) extends Family{
  override def familySize(): Int = {
    children.length + 2
  }
}

class SimpleTime(val hours: Int, val minutes: Int = 0) {}





