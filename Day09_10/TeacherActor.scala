package Day09_10

import Day09_10.TeacherProtocol.{QuoteResponse, QuoteRequest}
import akka.actor.{ActorLogging, Actor}

/**
  * akka tut on actors
  */
class TeacherActor extends Actor with ActorLogging{

  val quotes = List(
    "Moderation is for cowards",
    "Anything worth doing is worth overdoing",
    "The trouble is you think you have time",
    "You never gonna know if you never even try",
    "It ain't easy being green",
    "The letter of the day is 'D'",
    "Mana mana. Doo, doo, doo, doo."
  )

  override def receive: Receive = {
    //pattern matches for QuoteRequest
    case QuoteRequest =>{
      import util.Random
      //construct a QuoteResponse
      val quoteResponse = QuoteResponse(quotes(Random.nextInt(quotes.size)))
      //log the response
//      log.info(quoteResponse.toString)
//
//      println(quoteResponse)

      //respond back to Student Actor who is the original sender of QuoteRequest
      sender ! quoteResponse
    }
  }

  def quoteList = quotes
}
