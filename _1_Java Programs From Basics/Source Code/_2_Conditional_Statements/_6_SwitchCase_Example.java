package _2_Conditional_Statements;

import java.util.Scanner;

public class _6_SwitchCase_Example
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number from '0 to 3': ");
        int input_num = scanner.nextInt();

        switch(input_num)
        {
            case 0:
                System.out.println("The number is "+input_num+" zeroth block");
                break;

            case 1:
                System.out.println("The number is "+input_num+" first block");
                break;

            case 2:
                System.out.println("The number is "+input_num+" second block");
                break;

            case 3:
                System.out.println("The number is "+input_num+" third block");
                break;

            default:
                System.out.println("The entered number " +input_num+" doesn't lies on any block");
        }
    }
}
