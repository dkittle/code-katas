package roman


object ArabicToRoman {

  def roman(input: Int): String = {

    if (input < 1 || input > 3999)
      throw new IllegalArgumentException("number out of range (1-3999)")

    val tens = List("", "M", "C", "X")
    val fives = List("", "D", "L", "V")
    val ones = List("M", "C", "X", "I")

    val chars = ("0000" + input.toString).takeRight(4).toCharArray
    val digits = chars.map(x => x.toString.toInt)
    // A List of 4 lists, each inner list contains the digit to convert, plus the 10s, 5s and 1s numeral for that digit position
    val data = (digits zip tens zip fives zip ones).map {  case (((a, b), c) ,d) => (a, b, c, d) }
    data.map { case (d, t, f, o) => romanDigit(d, t, f, o) }.mkString("")
  }

  def romanDigit(number: Int, ten: String, five: String, one: String): String = {
    if (number > 9)
      throw new IllegalArgumentException("number out of range (0-9)")

    number match {
      case x if number == 9 => one + ten
      case x if number > 5 => five + one * (number - 5)
      case x if number > 3 => one * (5 - number) + five
      case x if number > 0 => one * x
      case _ => ""
    }
  }
}
