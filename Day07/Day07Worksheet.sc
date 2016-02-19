import atomicscala.AtomicTest._
import collection.mutable

//1.
//(a)
val v = Vector(1, 2, 3, 4)
v.map(n=> n * 11 + 10) is Vector(21, 32, 43, 54)
//(b) this won't work as the calculation will not be saved in the collection
v.foreach(n=> (n * 11) + 10) //is Vector(21, 32, 43, 54)


//(c) obviously there are much more opportunities for errors in this method
//and similar to (b), this needs to be mapped to a new vector each iteration
var u = Vector[Int]()
for(elem <- v){
  u :+= elem * 11 + 10
}
u is Vector(21, 32, 43, 54)


//2.
var w = Vector(1, 2, 3, 4)
var x = Vector[Int]()
for(elem <- w){
  x :+= elem + 1
}
println(x)
w = x
w is Vector(2,3,4,5)

//3.
val y = Vector(1, 10, 100, 1000)
var z = 0
//y.reduce((sum, n) => sum + n) is 1111
for(elem <- y){
  z += elem
}
z is 1111


//4.
def sumIt(values : Int*): Int = {
  values.reduce((sum, n) => sum + n)
}
sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195

//5.
//(a)
trait Shape{
  def sides(): Int
  def perimeter(): Double
  def area(): Double
}

class Circle(val radius: Int) extends Shape{
  override def sides(): Int = 1

  override def perimeter(): Double = radius * 2 * math.Pi

  override def area(): Double = radius * radius * math.Pi
}

class Rectangle(val length: Int, val width: Int) extends Shape{
  override def sides(): Int = 4

  override def perimeter(): Double = length * 2 + width * 2

  override def area(): Double = length * width
}

class Square(val length: Int) extends Shape{
  override def sides(): Int = 4

  override def perimeter(): Double = length * 4

  override def area(): Double = length * length
}






