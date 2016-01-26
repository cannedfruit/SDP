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






