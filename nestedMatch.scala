/**
  * Created by Sarah on 6/3/2016.
  */
class nestedMatch {

  def all_except_option(s:String, lst:List[String]):Option[List[String]] = lst match{
    case Nil => None
    case hd :: tail => {
      if (s == hd) Some(tail)
      else all_except_option(s, tail) match{
        case None => None
        case Some(y) => Some(hd::y)
      }
    }
  }

  def getSub1(lst:List[List[String]], str:String):List[String] = lst match{
    case Nil => Nil
    case x :: xs => all_except_option(str, x) match{
      case None=> getSub1(xs, str)
      case Some(y)=> y:::getSub1(xs,str)
    }
  }

  def getSub2(lst:List[List[String]], str:String): List[String]={
    def helper(acc:List[String], subs:List[List[String]]):List[String] = lst match{
      case Nil => acc
      case x::xs => all_except_option(str, x) match{
        case None=> helper(acc,xs)
        case Some(y) => helper(y:::acc, xs)
      }
    }
    helper(List(), lst)
  }

  type Name = (String, String, String)

  def similar_names(subs:List[List[String]], name:Name):List[Name] ={
    val (first, middle, last) = name
    def makeNames(lst:List[String]): List[Name]= lst match{
      case Nil=> Nil
      case x::xs=> List((x,last,middle)):::makeNames(xs)
    }
    name::makeNames(getSub2(subs, first))
  }
}
