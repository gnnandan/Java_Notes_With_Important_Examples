package _4_functions._2_Types_Of_Functions;

import java.util.Scanner;

public class _1_noParameterAndReturn
{
    public static void main(String[] args)
    {
        System.out.println("METHOD TYPE: NO PARAMETER AND NO RETURN VALUE");
        System.out.println("----------------------------------------------");
        sum();
    }
    static void sum()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int b = scanner.nextInt();

        int sum = a+b;
        System.out.println("The sum of a:"+a+" and b:"+b+" is :"+sum);
    }
}
