package Conditional_Statements;

import java.util.Scanner;

public class _1_if_Example
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        if (a > b)
        {
            System.out.println("'a' is greater than 'b'");
        }
        System.out.println("Program ends here...!");
    }
}
