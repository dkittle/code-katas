package fizzbuzz

/**
 * Created by don on 15-09-26.
 */
object Talker {

  def speak(i: Int): String = {
    if (i < 1)
      throw new IllegalArgumentException("I cannot speak numbers less than 1")

    speakNumber(i)
  }

  private def speakNumber(i: Int): String = i match {
    case x if (x % 15 == 0) => "fizzbuzz"
    case x if (x % 5 == 0) => "buzz"
    case x if (x % 3 == 0) => "fizz"
    case x => x.toString
  }

}
