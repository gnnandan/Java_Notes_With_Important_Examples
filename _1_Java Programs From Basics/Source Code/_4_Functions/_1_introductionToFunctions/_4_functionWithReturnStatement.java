package _4_Functions._1_introductionToFunctions;

import java.util.Scanner;

public class _4_functionWithReturnStatement
{
    public static void main(String[] args)
    {
        System.out.println("Function with return statement example");
        int result = sum();
        System.out.println(result);
    }

    static int sum()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a: ");
        int num1 = sc.nextInt();
        System.out.print("Enter b: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
