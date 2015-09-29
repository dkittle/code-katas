package roman

import scala.annotation.tailrec

/**
 * Created by don on 15-09-28.
 */
object ArabicToRoman {

   def roman(i: Int): String = {
     if (i < 1)
       throw new IllegalArgumentException("Cannot convert numbers less than 1")

     @tailrec
     def buildRoman(i: Int, s: String): String = {

       i match {
         case x if x >= 10 => buildRoman(i - i / 10 * 10, "X" * (i / 10))
         case 9 => buildRoman(0, s + "IX")
         case x if x >= 5 => buildRoman(i - 5, s + "V")
         case 4 => buildRoman(i - 4, s + "IV")
         case x if i < 4 => "" + s + "I" * i
         case 0 => s
       }
     }
     buildRoman(i, "")
   }

}
