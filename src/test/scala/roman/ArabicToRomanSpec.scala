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

  it should "return VI if passed 6" in {
    ArabicToRoman roman(6) should be ("VI")
  }

  it should "return VIII if passed 8" in {
    ArabicToRoman roman(8) should be ("VIII")
  }

  it should "return IX if passed 9" in {
    ArabicToRoman roman(9) should be ("IX")
  }

  it should "return X if passed 10" in {
    ArabicToRoman roman(10) should be ("X")
  }

  it should "return XX if passed 20" in {
    ArabicToRoman roman(20) should be ("XX")
  }

  it should "return XXII if passed 22" in {
    ArabicToRoman roman(22) should be ("XXII")
  }

  it should "return XXXIX if passed 39" in {
    ArabicToRoman roman(39) should be ("XXXIX")
  }

}
