package fizzbuzz

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {

  "A Talker" should "output 1 when passed a 1" in {
    FizzBuzz output 1 should be ("1")
  }

  it should "output 2 when passed a 2" in {
    FizzBuzz output 2 should be ("2")
  }

  it should "output fizz when passed a 3" in {
    FizzBuzz output 3 should be ("fizz")
  }

  it should "output buzz when passed a 5" in {
    FizzBuzz output 5 should be ("buzz")
  }

  it should "output fizz when passed a 6" in {
    FizzBuzz output 6 should be ("fizz")
  }

  it should "output fizzbuzz when passed a 15" in {
    FizzBuzz output 15 should be ("fizzbuzz")
  }

  it should "throw IllegalArgumentException if passed a number less than 1" in {
    a [IllegalArgumentException] should be thrownBy {
      FizzBuzz output 0
    }
  }

}