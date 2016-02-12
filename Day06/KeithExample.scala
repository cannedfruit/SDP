package Day06

////polymorphism:
//sealed trait A {
//  def fun: String = "I am an A"
//}
//
//final case class B() extends A{
//  override def fun: String = "This is a B"
//}
//
//final case class C() extends A{
//  override def fun: String = "This is a C"
//}
//
////product type
//
//case class Car(p: Petrol, e: Electric){
//  def f: Hybrid = ???
//}
//
//trait Petrol
//trait Electric
//trait Hybrid
//
////sum type
//sealed trait Politican{
//  def pay: Amount
//}
//
//final case class Honest() extends Politican{
//  def pay: Amount = ???
//}
//
//trait Amount
//
////Pattern Matching:
//
////product type
////M has a n:N and o:O
////method p returning P
//def p(m:M): P =
//  m match{
//    case M(n,o)=> ???
//}
//
//case class M(n: N, o: O)
//
//trait N
//trait O
//trait P

sealed trait Cats{
  //poly: each class has to override this method (OO)
  def eat: Food
  //pattern matching (FP)
  def eat2: Food =
    this match{
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Human
      case Garfield => Lasagna
      case DomesticCat(favouriteFood) => CatFood(favouriteFood)
    }
}

//can also do pattern matching outside:
object Diner{
  def eat2(cat: Cats): Food =
    cat match{
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Human
      case Garfield => Lasagna
      case DomesticCat(favouriteFood) => CatFood(favouriteFood)
    }
}
final case class Lion() extends Cats {
  override def eat: Food = Antelope
}
final case class Tiger() extends Cats {
  override def eat: Food = TigerFood
}
final case class Panther() extends Cats {
  override def eat: Food = Human
}
final case object Garfield extends Cats {
  override def eat: Food = Lasagna
}
final case class DomesticCat(favouriteFood: String) extends Cats {
  override def eat: Food = CatFood(favouriteFood)
}

sealed trait Food
final case object Lasagna extends Food
final case object Antelope extends Food
final case object TigerFood extends Food
final case object Human extends Food
final case class CatFood(food: String) extends  Food

