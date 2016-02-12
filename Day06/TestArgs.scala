package Day06

import java.time.temporal.TemporalAmount

import atomicscala.AtomicTest._

/*
Class Arguments (3-5)
 */
object TestArgs extends App {
  //3.
  println("3.")
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4
  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3
  //4.
  println("\n4.")
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
  //7.
  println("\n7.")
  val t2 = new SimpleTime(hours=10)
  t2.hours is 10
  t2.minutes is 0

  //8.
  println("\n8.")
  val p = new Planet(name = "Mercury",
    description = "small and hot planet", moons = 0)
  p.hasMoon is false

  //9. NO NEED TO CHANGE CODE -> MAGIC!!
  println("\n9.")
  val earth = new Planet(moons = 1, name = "Earth",
    description = "a hospitable planet")
  earth.hasMoon is true

//10.
  println("\n10.")
  val flour = new Item(name="flour", 4)
  flour.cost(grocery=true) is 4
  val sunscreen = new Item(
    name="sunscreen", 3)
  sunscreen.cost() is 3.3
  val tv = new Item(name="television", 500)
  tv.cost(rate = 0.06) is 530

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

class Planet(name: String, description: String, moons: Int){
  val hasMoon = if(moons > 0 ) true else false
}

class Item(name: String, var price: Double){

  def cost (rate: Double = 0.10, grocery: Boolean = false, medication: Boolean = false): Double ={
    if(grocery || medication) price
    else price * rate + price
  }




}





