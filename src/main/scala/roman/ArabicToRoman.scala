package roman

/**
 * Created by don on 15-09-28.
 */
object ArabicToRoman {

   def roman(i: Int): String = {
     if (i < 1)
       throw new IllegalArgumentException("Cannot convert numbers less than 1")

     i match {
       case 5 => "V"
       case 4 => "IV"
       case x if i < 4 => "I" * i
     }
   }

}
