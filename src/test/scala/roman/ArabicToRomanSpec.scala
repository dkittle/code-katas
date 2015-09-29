package roman

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by don on 15-09-28.
 */
class ArabicToRomanSpec extends FlatSpec with Matchers {

  "An Arabic to Roman Numeral Converter" should "throw IllegalArgumentException if passed a number less than 1" in {
    a [IllegalArgumentException] should be thrownBy {
      ArabicToRoman roman(0)
    }
  }

  it should "return I if passed 1" in {
    ArabicToRoman roman(1) should be ("I")
  }

  it should "return II if passed 2" in {
    ArabicToRoman roman(2) should be ("II")
  }

  it should "return III if passed 3" in {
    ArabicToRoman roman(3) should be ("III")
  }

  it should "return IV if passed 4" in {
    ArabicToRoman roman(4) should be ("IV")
  }

  it should "return V if passed 5" in {
    ArabicToRoman roman(5) should be ("V")
  }

}
