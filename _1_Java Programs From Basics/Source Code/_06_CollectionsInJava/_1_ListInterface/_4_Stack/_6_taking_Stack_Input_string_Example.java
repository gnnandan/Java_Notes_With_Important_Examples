package _06_CollectionsInJava._1_ListInterface._4_Stack;

import java.util.Scanner;
import java.util.Stack;

public class _6_taking_Stack_Input_string_Example
{
    public static void main(String[] args)
    {
        //creating a stack
        Stack<String> strs = new Stack<String>();

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<=5;i++)
        {
            System.out.print("Enter the element one by one: ");
            String a = scanner.next();
            strs.push(a);
        }

        System.out.println("The final Stack elements are: "+strs);
    }
}
