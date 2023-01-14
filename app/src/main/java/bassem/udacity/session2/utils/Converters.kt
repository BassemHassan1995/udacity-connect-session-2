package bassem.udacity.session2.utils

import androidx.databinding.InverseMethod

object Converters {

    @InverseMethod("stringToInt")
    @JvmStatic
    fun intToString(
        value: Int
    ): String = value.toString()
    // Converts Int to String.

    @JvmStatic
    fun stringToInt(
        value: String
    ): Int = value.toInt()
}