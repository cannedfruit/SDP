package Day09

import Day09.TeacherProtocol.{QuoteResponse, QuoteRequest}
import akka.actor.Actor

/**
  * akka tut on actors
  */
class TeacherActor extends Actor{

  val quotes = List(
    "Moderation is for cowards",
    "Anything worth doing is worth overdoing",
    "The trouble is you think you have time",
    "You never gonna know if you never even try")

  override def receive: Receive = {
    //pattern matches for QuoteRequest
    case QuoteRequest =>{
      import util.Random
      //construct a QuoteResponse
      val quoteResponse = QuoteResponse(quotes(Random.nextInt(quotes.size)))

      println(quoteResponse)
    }
  }
}
