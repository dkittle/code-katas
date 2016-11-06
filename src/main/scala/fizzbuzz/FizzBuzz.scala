package fizzbuzz

object FizzBuzz {

  def output(i: Int): String = {
    if (i < 1)
      throw new IllegalArgumentException("I cannot output numbers less than 1")

    i match {
      case x if x % 15 == 0 => "fizzbuzz"
      case x if x % 5 == 0 => "buzz"
      case x if x % 3 == 0 => "fizz"
      case x => x.toString
    }
  }

}
