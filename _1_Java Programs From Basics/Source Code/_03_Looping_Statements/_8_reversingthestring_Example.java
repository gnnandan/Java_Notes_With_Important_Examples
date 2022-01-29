package _03_Looping_Statements;

import java.util.Scanner;

public class _8_reversingthestring_Example
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String normalStr = scanner.next();

        String revStr = "";
        normalStr = normalStr.toLowerCase();
        for(int i = normalStr.length()-1;i>=0;i--)
        {
            revStr = revStr+normalStr.charAt(i);
        }

        System.out.println("The reverse of string is: "+revStr);
    }
}
