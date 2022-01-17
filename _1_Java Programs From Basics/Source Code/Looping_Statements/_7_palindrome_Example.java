package Looping_Statements;

import java.util.Locale;

public class _7_palindrome_Example
{
    public static void main(String[] args)
    {
        String name = "madam";
        name = name.toLowerCase();
        String rev = "";
        for(int i = name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i)+" ");
            rev = rev + name.charAt(i);
        }

        System.out.println();
        if(name.equals(rev))
        {
            System.out.println("The string is palindrome");
        }
        else
        {
            System.out.println("The string is not Palindrome");
        }
    }
}
