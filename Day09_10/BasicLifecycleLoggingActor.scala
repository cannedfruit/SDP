package Day09_10

import akka.actor.{Actor, ActorLogging}
import akka.event.LoggingReceive

/**
  * Created by Sarah on 3/31/2016.
  */
class BasicLifecycleLoggingActor extends Actor with ActorLogging{

  log.info("inside BasicLifecycleActor constructor")
  log.info(context.self.toString())

  override def preStart() ={
    log.info("inside preStart method od BasicLifecycleLoggingActor")
  }

  def receive: Receive = LoggingReceive{
    case "hello" => log.info("hello")
    case "stop" => context.stop(self)
  }
//
//  override def postStop() ={
//    log.info("inside postStop method of BasicLifecycleLoggingActor")
//  }
}
