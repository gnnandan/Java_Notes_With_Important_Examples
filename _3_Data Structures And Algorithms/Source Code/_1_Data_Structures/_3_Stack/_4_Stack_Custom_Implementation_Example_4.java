package _1_Data_Structures._3_Stack;
/**
 * Iterative Development of this application
 */

import java.util.Scanner;

class stackType
{
    int[] data;
    int capacity;
    int top=-1;

    //constructor
    stackType(int stack_size)
    {
        //top =-1;
        this.capacity = stack_size;
        data = new int[capacity];
    }

    /**
     * @Methods that stack is applicable for
     * - push()
     * - pop()
     * - peak()
     * - display()
     */

    void push(int item)
    {
        //handling underflow
        if(top == data.length-1)
        {
            System.out.println("Stack is overflow...!");
        }
        top=top+1;
        data[top]= item;
    }

    int pop(int popEle)
    {
        if(top==-1)
        {
            System.out.println("Stack is underflow...!");
        }
        return 0;
    }

    int peek()
    {
        return data[top];
    }


    void display()
    {

        for(int i=0;i<=top;i++)
        {
            System.out.print(data[i]+" ");
        }
    }

    int size()
    {
        int counter;

        return top;
    }
}

public class _4_Stack_Custom_Implementation_Example_4
{
    public static void main(String[] args)
    {
        Scanner scc = new Scanner(System.in);
        System.out.print("Choose case:" +
                "\n1. Push(), DISPLAY() AND PEEK(): " +
                "\n2. POP(), DISPLAY() AND PEEK(): : " +
                "\nEnter your choice: ");
        int inputChoice = scc.nextInt();

        System.out.print("Enter the size of stack: ");
        int stackSize  = scc.nextInt();

        //creating an instance for the class
        stackType stackInstance = new stackType(stackSize);
//        stackInstance.push(12);
//        stackInstance.push(13);

        boolean flag=true;
        while(flag=true)
        {
            System.out.println("Do you want to push or pop into the: ");
            int input = scc.nextInt();
            if(input==1)
            {
                switch(inputChoice)
                {
                    case 1:
                        Scanner pushElement = new Scanner(System.in);
//                stackInstance.push(12);
//                stackInstance.push(13);
                        for(int i=0;i<stackSize;i++)
                        {
                            System.out.print("Enter the element at "+i+" : ");
                            int ele = pushElement.nextInt();
                            stackInstance.push(ele);
                        }
                        System.out.println();
                        System.out.print("The elements after pushing into the stack: ");
                        stackInstance.display();
                        System.out.println("\nThe element at the top: "+stackInstance.peek());
                        System.out.println("The size of stack is: "+stackInstance.size());

                        break;
                    case 2:
                        Scanner popElements = new Scanner(System.in);
                        System.out.print("Enter how many elements you want to pop from the top of stack:  ");
                        int popEle = popElements.nextInt();
                        for(int i=0;i<stackSize;i++)
                        {
                            stackInstance.pop(popEle);
                        }
                        System.out.print("The elements after popping from the stack: ");
                        stackInstance.display();
                        System.out.println("The element at the top: "+stackInstance.peek());
                        System.out.println("The size of stack is: "+stackInstance.size());
                        break;
                    default:
                        System.out.println("Invalid Choice...!");
                }
            }
            else
            {
                break;
            }
            System.out.println("The final elements are: ");
            stackInstance.display();
        }
    }
}

//issue with repeating the loop


