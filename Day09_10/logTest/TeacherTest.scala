package Day09_10.logTest

import Day09_10.{TeacherLogParameterActor, TeacherActor}
import Day09_10.TeacherProtocol.QuoteRequest
import akka.actor.ActorSystem
import akka.testkit.{EventFilter, TestActorRef, TestKit}
import com.typesafe.config.ConfigFactory
import org.scalatest.{BeforeAndAfterAll, MustMatchers, WordSpecLike}

/**
  * Created by Sarah on 3/1/2016.
  */
class TeacherTest extends TestKit(ActorSystem("UniversityMessageSystem", ConfigFactory.parseString("""akka.loggers = ["akka.testkit.TestEventListener"]""")))
  with WordSpecLike
  with MustMatchers
  with BeforeAndAfterAll{

  //1. Sends message to the Print Actor. Not even a testcase actually
  "A teacher" must {

    "print a quote when a QuoteRequest message is sent" in {

      val teacherRef = TestActorRef[TeacherActor]
      teacherRef ! QuoteRequest
    }
  }

  //2. Sends message to the Log Actor. Again, not a testcase per se
  "A teacher with ActorLogging" must {

    "log a quote when a QuoteRequest message is sent" in {

      val teacherRef = TestActorRef[TeacherActor]
      teacherRef ! QuoteRequest
    }

    //3. Asserts the internal State of the Log Actor.
    "have a quote list of size 4" in {

      val teacherRef = TestActorRef[TeacherActor]
      teacherRef.underlyingActor.quoteList must have size 7
      teacherRef.underlyingActor.quoteList must have size 7
    }

    //4. Verifying log messages from eventStream
    "be verifiable via EventFilter in response to a QuoteRequest that is sent" in {

      val teacherRef = TestActorRef[TeacherActor]
      EventFilter.info(pattern = "QuoteResponse*", occurrences = 1) intercept {
        teacherRef ! QuoteRequest
      }
    }

    //5. have a quote list of the same size as the input parameter
    " have a quote list of the same size as the input parameter" in {

      val quotes = List(
        "Moderation is for cowards",
        "Anything worth doing is worth overdoing",
        "The trouble is you think you have time",
        "You never gonna know if you never even try")

      val teacherRef = TestActorRef(new TeacherLogParameterActor(quotes))
      //val teacherRef = TestActorRef(Props(new TeacherLogParameterActor(quotes)))

      teacherRef.underlyingActor.quoteList must have size 4
      EventFilter.info(pattern = "QuoteResponse*", occurrences = 1) intercept {
        teacherRef ! QuoteRequest
      }
    }
  }

  override def afterAll() {
    super.afterAll()
    system.terminate()
  }
}
