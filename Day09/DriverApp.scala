package Day09

import Day09.StudentProtocol.InitSignal
import akka.actor.{ActorSystem, Props, ActorRef}

/**
  * Created by Sarah on 3/31/2016.
  */
object DriverApp extends  App{

  //Initialise the ActorSystem
  val system = ActorSystem("UniversityMessageSystem")

  //create teacher actor
  val teacherRef = system.actorOf(Props[TeacherActor], "teacherActor")

  //create the student actor - pass the teacher actorRef as a constructor parameter to StudentActor
  val studentRef = system.actorOf(Props(new StudentActor(teacherRef)), "studentActor")

  //send a message to the student actor
  studentRef ! InitSignal

  //Let's wait for a couple of seconds before we shut down the system
  Thread.sleep(2000)

  //Shut down the ActorSystem.
  system.terminate()

}
