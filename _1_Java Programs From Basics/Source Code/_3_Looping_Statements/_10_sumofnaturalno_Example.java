package _3_Looping_Statements;

import java.util.Scanner;

public class _10_sumofnaturalno_Example
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int s_num = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int e_num = scanner.nextInt();

        int sum = 0;

        for(int i = s_num; i<=e_num; i++)
        {
            sum = sum+i;
        }

        System.out.println("The sum of Natural numbers from "+s_num+" and "+e_num+" is: "+sum);
    }
}
