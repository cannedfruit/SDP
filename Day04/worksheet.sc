import atomicscala.AtomicTest._

val i = 17
//i = 20
//i is immutable and cannot be changed
"ABC1234"
//res0 = "DEF1234"
//res0 is a local temporary variable and is not recognized by the compiler
val j = 15.56
println(j)

//Expressions
var temp = 81
var sky = "sunny"
var isNice = {
  if(sky == "sunny" && temp > 80) true
  else false
}

var isFine = {
  if((sky == "sunny" || sky == "partly cloudy") && temp > 80) true
  else false
}

var isColdOrHot = {
  if((sky == "sunny" || sky == "partly cloudy")
    && (temp > 80 || temp < 20)) true
  else false
}
var FtoC = {
  ((temp - 32) * 5)/9
}

var CtoF = {
  ((temp * 9)/5) + 32
}

//methods
def getSquare (a: Int) = {a*a}
val a = getSquare(3)
assert(a == 9)
val b = getSquare(6)
assert(b == 36)
val c = getSquare(5)
assert(c == 25)

def isArg1GreaterThanArg2 (i:Double, j:Double) = {
  if(i>j) true else false
}
val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(!t1)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(t2)

def manyTimesString(p:String, q:Int) = {
  var result = ""
  for(i <- 1 to q){
    result += p
  }
  result
}
val m1 = manyTimesString("abc", 3)
assert("abcabcabc" == m1, "word failed to multiply appropriately")

val m2 = manyTimesString("123", 2)
assert("123123" == m2, "word failed to multiply appropriately")

//Classes & Objects
val r1 = 0 until 10
r1.step
val r2 = 0 until 10 by 2
r2.step

var s1 = "Sally"
var s2 = "Sally"
if(s1.equals(s2)) println("s1 and s2 are equal")
else println("s1 and s2 are not equal")

//Creating Classes
class Hippo{}
val testHippo = new Hippo()
class Lion{}
val testLion = new Lion()
class Tiger{}
val testTiger = new Tiger()
class Monkey{}
val testMonkey = new Monkey()
class Giraffe{}
val testGiraffe = new Giraffe()

val secondLion = new Lion()
val secondGiraffe = new Giraffe()
val thirdGiraffe = new Giraffe()
//multiple objects of the same class only differ on their memory address

//Methods inside Classes
class Sailboat{
  def raise() = {
    "Sails raised"
  }
  def lower() = {
    "Sails lowered"
  }
  def signal() = {
    val flare = new Flare();
    flare.light
  }
}
class Motorboat{
  def on() = {
    "Motor on"
  }
  def off() = {
    "Motor off"
  }
  def signal() = {
    val flare = new Flare
    flare.light
  }
}

val sailboat = new Sailboat
val z1 = sailboat.raise()
assert(z1 == "Sails raised", "Expected Sails raised, Got " + r1)
val z2 = sailboat.lower()
assert(z2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
val motorboat = new Motorboat
val y1 = motorboat.on()
assert(y1 == "Motor on", "Expected Motor on, Got " + s1)
val y2 = motorboat.off()
assert(y2 == "Motor off", "Expected Motor off, Got " + s2)

class Flare{
  def light = {
    "Flare used!"
  }
}

val flare = new Flare
val f1 = flare.light
assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
val sailboat2 = new Sailboat
val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
val motorboat2 = new Motorboat
val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)

//Fields in Classes
class Cup {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {

    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    if(percentFull < 0) percentFull = 0
    percentFull // Return this value
  }
  def set(newValue:Int) ={
    percentFull = newValue
  }
  def get() = {
    percentFull
  }
}

val cup = new Cup

cup.add(45) is 45
cup.add(-55) is 0
cup.add(10) is 10
cup.add(-9) is 1
cup.add(-2) is 0

cup.percentFull = 56
cup.percentFull is 56

cup.set(56)
cup.get() is 56

//Vectors
val vec1 = Vector.empty
val vec2 = vec1:+1:+2
val vec3 = Vector("The", "dog", "visited", "the","fire","station")
val vec4 = Vector(1,2,Vector(1,2,3))
val vec5 = Vector(1.0, 2.0, 3.0)

var sentence = ""
vec3.foreach((a) =>sentence += a + " ")
sentence.toString() is "The dog visited the fire station "

vec2.sum
vec2.max
vec2.min
vec5.sum
vec5.max
vec5.min

val myVector1 = Vector(1,2,3,4,5,6)
val myVector2 = Vector(1,2,3,4,5,6)
myVector1 is myVector2







