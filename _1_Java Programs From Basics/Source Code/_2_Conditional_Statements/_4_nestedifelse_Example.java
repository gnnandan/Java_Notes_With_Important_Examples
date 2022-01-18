package _2_Conditional_Statements;

import java.util.Scanner;

public class _4_nestedifelse_Example
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        if(a > 0)
        {
            System.out.println("The Comparison is happening for only positive number");
            if(a>b)
            {
                System.out.println("'a' is greater than 'b'");
            }
            else if(a<b)
            {
                System.out.println("'b' is greater than 'a'");
            }
            else
            {
                System.out.println("'a' and 'b' are equal");
            }
        }
        else
        {
            System.out.println("The Comparison is happening for only negative numbers");
            if(a>b)
            {
                System.out.println("'a' is greater than 'b'");
            }
            else if(a<b)
            {
                System.out.println("'b' is greater than 'a'");
            }
            else
            {
                System.out.println("'a' and 'b' are equal");
            }
        }
    }
}
