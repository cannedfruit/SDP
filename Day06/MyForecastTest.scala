package Day06

import atomicscala.AtomicTest._;

object MyForecastTest extends App{
  forecast(100) is "Sunny"
  forecast(80) is "Mostly Sunny"
  forecast(50) is "Partly Sunny"
  forecast(20) is "Mostly Sunny"
  forecast(0) is "Cloudy"
  forecast(15) is "Unknown"

  def forecast(temp: Int): String = {
    if(temp == 100 ) return "Sunny"
    if(temp == 80) return "Mostly Sunny"
    if(temp == 50) return "Partly Sunny"
    if(temp == 20) return "Mostly Sunny"
    if(temp == 0) "Cloudy"
    else "Unknown"
  }


}
