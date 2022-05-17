package _12_Data_Structures_In_Java._1_1_Stacks_Using_Collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class stackClass_1
{
    public static void main(String[] args)
    {
        Stack<Object> data = new Stack<Object>();

        //pushing element
        data.push(100);
        data.push(200);
        data.push(300);
        data.push(400);
        data.push(500);

        System.out.println("After push: "+data); //display elements

        //popping
        data.pop();
        System.out.println("After pop: "+data);

        //iterating
        System.out.println("Iterating elements of stack: ");
        for(Object contents: data)
        {
            System.out.println(contents);
        }

        //accessing
        System.out.println("Accessing element: "+data.get(3));

        //updating element
        System.out.println("Updating element: "+data.set(3,444));
        System.out.println("After update: "+data);

        //iterating using iterator class
        Iterator<Object> itet = data.iterator();
        System.out.println("Iterating using iterator class: ");
        while(itet.hasNext())
        {
            System.out.println(itet.next());
        }

        takeStackInput(data);

    }

    static void takeStackInput(Stack<Object> stack)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the stack size: ");
        int size = input.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the element at "+i+": ");
            Object num = input.next();
            stack.push(num);
        }
        System.out.println("The total elements of stack are: "+stack);
    }
}
