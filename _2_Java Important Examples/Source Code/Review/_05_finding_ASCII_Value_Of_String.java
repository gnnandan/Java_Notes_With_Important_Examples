package Review;

import java.util.Scanner;

public class _05_finding_ASCII_Value_Of_String
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the string: ");
//        String name = scanner.next();
        String name = "gnnandan7@gmail.com";

        for (int i = 0; i < name.length(); i++)
        {
            System.out.println("Char: "+name.charAt(i)+" ASCII Equivalent: "+(int)name.charAt(i));
        }

    }
}
