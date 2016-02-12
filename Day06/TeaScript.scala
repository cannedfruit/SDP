package Day06

import atomicscala.AtomicTest._

/*
* Constructors
 */
object TeaScript extends  App{
  //11. Constructors
    val tea = new Tea
    tea.describe is "Earl Grey"
    tea.calories is 0
    val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
    lemonZinger.describe is "Lemon Zinger decaf"
    lemonZinger.calories is 0
    val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
    sweetGreen.describe is "Jasmine Green + sugar"
    sweetGreen.calories is 16
    val teaLatte = new Tea(sugar=true, milk=true)
    teaLatte.describe is "Earl Grey + milk + sugar"
    teaLatte.calories is 116

  //12.
  val washer1 = new ClothesWasher
  val washer2 = new ClothesWasher("modelName")
  val washer3 = new ClothesWasher(32.0)

  //13.
  val washer4 = new ClothesWasher2
  val washer5 = new ClothesWasher2("modelName")
  val washer6 = new ClothesWasher2(capacity = 32.0)
}

class Tea(decaf: Boolean = false, name: String = "Earl Grey", sugar: Boolean = false, milk: Boolean = false){
  def describe(): String = {
    var description = name
    if(decaf) description += " decaf"
    if(milk) description += " + milk"
    if(sugar) description += " + sugar"
    description
  }

  def calories(): Int = {
    var calories = 0
    if(sugar) calories += 16
    if(milk) calories += 100
    calories
  }
}

class ClothesWasher(){
  println("calling default constructor")
  def this(modelName: String){
    this()
    println("calling aux constructor String")
  }

  def this(capacity: Double){
    this()
    println("calling aux constructor Double")
  }
}

class ClothesWasher2(modelName: String = "model name", capacity: Double = 0.0)
