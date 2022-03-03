import java.util.Arrays;

/**
 * @Note - Anagram is a process of comparing string, if tow string are having same characters but may be or may not be
 * in same position then those strings are anagram.
 */

public class _31_checking_anagram_STRING
{
    public static void main(String[] args)
    {
        String s1 = "Barg".toLowerCase();
        String s2 = "Grab".toLowerCase();

        if(s1.length()!=s2.length())
        {
            System.out.println("Both are not having same string length, so not anagram");
        }
        else
        {
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            if(Arrays.equals(s1Array, s2Array))
            {
                System.out.println("Both strings are anagram");
            }
            else
            {
                System.out.println("Both strings are not anagram");
            }
        }
    }
}
