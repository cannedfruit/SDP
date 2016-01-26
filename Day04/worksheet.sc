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


