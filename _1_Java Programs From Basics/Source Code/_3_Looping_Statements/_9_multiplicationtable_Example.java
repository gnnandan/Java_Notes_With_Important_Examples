package _3_Looping_Statements;

import java.util.Scanner;

public class _9_multiplicationtable_Example
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to multiply: ");
        int num = scanner.nextInt();

        for(int i =1; i<=10;i++)
        {
            System.out.println(num +"*"+i+"="+num*i);
        }
    }
}
