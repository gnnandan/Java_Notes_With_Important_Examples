package _02_Conditional_Statements;

import java.util.Scanner;

public class _5_ConditionalOperators_Example
{
    /**
     * @Note
     * || - or
     * && - and
     * == - equalsTo
     * != - notEquals
     * ! - not
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers one by one: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1>num2&&num1>num3)
        {
            System.out.println("The number "+num1+" is greater than: "+num2+","+num3);
        }
        else if(num2>num1&&num2>num3)
        {
            System.out.println("The number "+num2+" is greater than: "+num1+","+num3);
        }
        else if(num3>num1&&num3>num2)
        {
            System.out.println("The number "+num3+" is greater than: "+num1+","+num2);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
