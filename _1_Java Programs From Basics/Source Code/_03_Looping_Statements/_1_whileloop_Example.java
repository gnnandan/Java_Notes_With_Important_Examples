package _03_Looping_Statements;

import java.util.Scanner;

public class _1_whileloop_Example
{
    public static void main(String[] args)
    {
        int a,b;
        int sum, count = 0;

        while(count <=3)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number 1: ");
            a = scanner.nextInt();

            System.out.print("Enter the number 2: ");
            b = scanner.nextInt();
            sum = a+b;
            System.out.println();

            System.out.println("The sum of "+a+" and "+b+" sum: "+sum);
            count ++;
        }
    }
}
