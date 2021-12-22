package functions._1_introductionToFunctions;

import java.util.Scanner;

public class _2_adding_two_numbers
{
    public static void main(String[] args)
    {
        System.out.println("Addition of 2 numbers using function");
        sum();
    }


    static void sum()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a: ");
        int num1 = sc.nextInt();
        System.out.print("Enter b: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
    }
}
