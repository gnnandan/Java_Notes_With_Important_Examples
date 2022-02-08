package _1_Data_Structures._3_Stack;

import java.io.IOException;

class customStack
{
    //as we know that stack is built on array, so we required array of some size
    protected int arr[];
    private static  final int Defalut_Size = 10;

    // if size of stack is not passed as an argument allocate the default size
    public customStack()
    {
        this(Defalut_Size);
    }

    //if size of stack is passed as a argument allocate the size
    public customStack(int size)
    {
        this.arr = new int[size];
    }

    int top=-1; //pointer: initially top =-1 in a stack

    //push operation
    public boolean push(int item)
    {
        if(stackIsFull())
        {
            System.out.println("Stack is full (Overflow)");
            return false;
        }
        else
        {
            top++; //increase the pointer
            arr[top] = item; //add the item
            return true;
        }
    }

    //pop operation
    public int pop() throws Exception
    {
        if(stackIsEmpty())
        {
            //creating own exception
            throw new Exception("Cannot pop element from the empty stack");
        }
        else
        {
            int removedItem = arr[top--];
            return removedItem;
        }
    }

    public int peek() throws  Exception
    {
        if(stackIsEmpty())
        {
            throw new Exception("Stack is empty: No item found exception");
        }
        else
        {
            return arr[top];
        }
    }

    //methods to check stack is empty or full
    private boolean stackIsFull()
    {
        return top == arr.length-1; //pointer is at last index
    }

    private boolean stackIsEmpty()
    {
        return top == -1; //pointer is at last index
    }
}


public class _1_stackProgram_Custom_Implementation_Example
{
    public static void main(String[] args) throws Exception
    {
        customStack stack = new customStack(5);

        //pushing elements to the stack
        System.out.println("Pushed: "+stack.push(10));
        System.out.println("Pushed: "+stack.push(12));
        System.out.println("Pushed: "+stack.push(14));
        System.out.println("Pushed: "+stack.push(16));
        System.out.println("Pushed: "+stack.push(18)); // "first in" when pushed() -----> also "last out" when popped

        //popping elements from the stack

        for(int i=0;i<5;i++)
        {
            System.out.println("The item "+stack.pop()+" is removed from index: "+i);
        }
//        System.out.println("The element removed: "+stack.pop());
//        System.out.println("The element removed: "+stack.pop());
//        System.out.println("The element removed: "+stack.pop());
//        System.out.println("The element removed: "+stack.pop());
//        System.out.println("The element removed: "+stack.pop());

//        System.out.println(stack.peek());

    }
}
