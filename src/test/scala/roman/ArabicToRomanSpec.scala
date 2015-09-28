package roman

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by don on 15-09-28.
 */
class ArabicToRomanSpec extends FlatSpec with Matchers {
  "An Arabic to Roman Numeral Converter" should "return an empty string when passed a 0" in {
    ArabicToRoman roman(0) should be ("")
  }

}
