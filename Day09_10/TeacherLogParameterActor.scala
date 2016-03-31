package Day09_10

import Day09_10.TeacherProtocol.{QuoteResponse, QuoteRequest}
import akka.actor.{Actor, ActorLogging}

/**
  * Created by Sarah on 3/1/2016.
  */
class TeacherLogParameterActor (quotes:List[String]) extends Actor with ActorLogging{
  //lazy val so it's only instantiates when called
  lazy val _quotes = quotes

  override def receive = {
    case QuoteRequest =>{
      import util.Random

      val quoteResponse = QuoteResponse(_quotes(Random.nextInt(_quotes.size)))
      log.info(quoteResponse.toString)
    }
  }

  def quoteList = _quotes
}
