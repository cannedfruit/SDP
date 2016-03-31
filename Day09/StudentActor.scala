package Day09

import Day09.StudentProtocol.InitSignal
import Day09.TeacherProtocol.{QuoteRequest, QuoteResponse}
import akka.actor.{Actor, ActorLogging, ActorRef}

/**
  * Created by Sarah on 3/31/2016.
  */
class StudentActor (teacherActorRef: ActorRef) extends Actor with ActorLogging{
  override def receive: Receive = {
    case InitSignal => {
      teacherActorRef ! QuoteRequest
    }
    case QuoteResponse(quoteString) => {
      log.info ("Received QuoteResponse from Teacher")
      log.info(s"Printing from Student Actor $quoteString")
    }
  }
}
