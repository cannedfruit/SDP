package Day09

/**
  * akka tut on actors
  */
object TeacherProtocol {

  case class QuoteRequest()
  case class QuoteResponse(quoteString:String)
}
