package _1_Data_Structures;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Important Operations
 * 1. Pushing element on the top of the stack  -- push()
 * 2. Popping element from the top of the stack --pop()
 * 3. Displaying element on the top of the stack --peak()
 * 4. Searching element in the stack -- search()
 */

class stackExample
{
    Scanner scanner = new Scanner(System.in);
    int num;

    //1. Pushing element on the top of the stack  -- push()
    public void push(Stack<Integer> stack)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of element: ");

        num = scanner.nextInt();
        System.out.println("push() operation");
        for(int i=0;i<=num;i++)
        {
            System.out.print("Enter the elements for position:  "+i+" = ");
            int j = scanner.nextInt();

            //push operation
            stack.push(j);
        }
    }

    //2. Popping element from the top of the stack --pop()
    public void pop(Stack<Integer> stack)
    {
        System.out.println("pop() operation");
        Integer j = (Integer) stack.pop();

        //pop operation
        System.out.println("The element popped: "+j);
    }

    //3. Displaying element on the top of the stack --peak()
    public void display(Stack<Integer> stack)
    {
        System.out.println("display() operation");
        Integer element = (Integer)stack.peek();
        if(element==-1)
        {
            System.out.println("No element found");
        }
        else
        {
            System.out.println("The element at the top is: "+element);
        }
    }

    //4. Searching element in the stack -- search()
    public void search(Stack<Integer> stack)
    {
        System.out.println("search() operation");
        System.out.print("Enter the element to find: ");
        int element = scanner.nextInt();
        Integer findEle = (Integer) stack.search(element);
        if(findEle ==-1)
        {
            System.out.println("Element Not found");
        }
        else
        {
            System.out.println("The element found at position "+stack.indexOf(findEle)+" and the element is: "+findEle);
        }
    }
}

//main class
public class _01_ListInterface_Stack_Example
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stackExample stackExample = new stackExample();

        stackExample.push(stack);
        stackExample.pop(stack);
        stackExample.search(stack);
        stackExample.display(stack);
    }
}
