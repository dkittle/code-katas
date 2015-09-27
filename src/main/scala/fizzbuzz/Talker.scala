package fizzbuzz

/**
 * Created by don on 15-09-26.
 */
object Talker {

  def speak(i: Int): String = {
    if (i < 1)
      throw new IllegalArgumentException("I cannot speak numbers less than 1")

    val sb = new StringBuilder

    if (i % 3 == 0)
      sb.append("fizz")

    if (i % 5 == 0)
      sb.append("buzz")

    if (sb.length == 0)
      sb.append(i.toString)
    sb.mkString
  }


}
