package Day09_10

/**
  * akka tut on actors
  */
object TeacherProtocol {

  case class QuoteRequest()
  case class QuoteResponse(quoteString:String)
}
