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

}
