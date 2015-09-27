package fizzbuzz

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {

  "A Talker" should "speak 1 when passed a 1" in {
    Talker speak(1) should be ("1")
  }

  it should "speak 2 when passed a 2" in {
    Talker speak(2) should be ("2")
  }

  it should "speak fizz when passed a 3" in {
    Talker speak(3) should be ("fizz")
  }

  it should "speak buzz when passed a 5" in {
    Talker speak(5) should be ("buzz")
  }

  it should "speak fizz when passed a 6" in {
    Talker speak(6) should be ("fizz")
  }

  it should "speak fizzbuzz when passed a 15" in {
    Talker speak(15) should be ("fizzbuzz")
  }

  it should "throw IllegalArgumentException if passed a number less than 1" in {
    a [IllegalArgumentException] should be thrownBy {
      Talker speak(0)
    }
  }

}