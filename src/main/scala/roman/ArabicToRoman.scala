package roman

/**
 * Created by don on 15-09-28.
 */
object ArabicToRoman {

   def roman(i: Int): String = {
     if (i < 1)
       throw new IllegalArgumentException("Cannot convert numbers less than 1")

     "I"
   }

}
