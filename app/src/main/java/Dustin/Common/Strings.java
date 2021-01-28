package Dustin.Common;

/** Common functions relating to Strings and chars.
 * @author  Dustin Weber */
public class Strings
{
    /** Iterates through all chars in string to check for numbers.
     * @param  s String to check for numbers.
     * @return True if string contains a number. */
    public static boolean ContainsDigit(String s)
    {
        for (char c : s.toCharArray())
            if (Character.isDigit(c))
                return true;
        return false;
    }
}
