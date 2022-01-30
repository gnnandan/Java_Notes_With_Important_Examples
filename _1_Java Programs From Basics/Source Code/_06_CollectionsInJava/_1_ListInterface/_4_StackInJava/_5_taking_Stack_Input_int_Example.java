package _06_CollectionsInJava._1_ListInterface._4_StackInJava;

import java.util.Scanner;
import java.util.Stack;

public class _5_taking_Stack_Input_int_Example
{
    public static void main(String[] args)
    {
        //creating a stack
        Stack<Integer> nums = new Stack<Integer>();

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<=5;i++)
        {
            System.out.print("Enter the element one by one: ");
            Integer a = scanner.nextInt();
            nums.push(a);
        }

        System.out.println("The final Stack elements are: "+nums);
    }
}
