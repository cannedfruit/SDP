package Day09

import Day09.TeacherProtocol.QuoteRequest
import akka.actor.{Props, ActorRef, ActorSystem, actorRef2Scala}

/**
  * Akka tutorial on Actors
  */
object StudentSimulatorApp extends App{

  //Step 1: initialize ActorSystem
  val actorSystem = ActorSystem("UniversityMessageSystem")

  //Step 2: create proxy to teacher actor
  val teacherActorRef: ActorRef = actorSystem.actorOf(Props[TeacherActor])

  //Step 3: send QuoteRequest to the proxy
  teacherActorRef ! QuoteRequest

  //Let's wait for a couple of seconds before we shut down the system
  Thread.sleep (2000)

  //Shut down the ActorSystem.
  actorSystem.terminate()
}
