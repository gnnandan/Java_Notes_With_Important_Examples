package _1_Data_Structures._3_Stack;

class stack
{
    int data[];
    int capacity;
    int top=-1;

    stack(int size)
    {
        this.capacity = size;
        data = new int[capacity];
    }

    //pushing
    void push(int item)
    {
        if(top==data.length-1)
        {
            System.out.println("Stack is overflow");
        }
        else
        {
            //increment top
            top=top+1;
            data[top] = item;
        }
    }

    //popping
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is underflow...!");
        }
        int removed = data[top=top-1];
        return removed;
    }

    int peek()
    {
        int topEle=-1;
        if(top==-1)
        {
            System.out.println("Stack is underflow...!");
        }
        else
        {
            topEle =  data[top];
        }
        return topEle;
    }

    //display()
    void display()
    {
        System.out.print("The final elements are: ");
        for(int i: data)
        {
            if(i==0)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    //returning the size of stack
    int size()
    {
        return top;
    }
}

public class _2_stack_Custom_Implementation_Understandable_Version_Example_2
{
    public static void main(String[] args)
    {
        stack stack = new stack(5);
        System.out.println("The initial size of stack: "+stack.size()+" and the top of stack is: "+stack.peek());

        stack.push(10);
        System.out.println("The size of stack: "+stack.size()+" and the top of stack is: "+stack.peek());

        stack.push(20);
        System.out.println("The size of stack: "+stack.size()+" and the top of stack is: "+stack.peek());

        stack.push(30);
        System.out.println("The size of stack: "+stack.size()+" and the top of stack is: "+stack.peek());

        System.out.println("The size of stack after removing an top element: "+stack.size()+" and the top of stack is: "+stack.pop());

        stack.push(40);
        System.out.println("The size of stack: "+stack.size()+" and the top of stack is: "+stack.peek());

        stack.push(50);
        System.out.println("The size of stack: "+stack.size()+" and the top of stack is: "+stack.peek());

//        stack.push(60);
//        System.out.println("The size of stack: "+stack.size()+" and the top of stack is: "+stack.peek());

//        stack.push(70);
//        System.out.println("The size of stack: "+stack.size()+" and the top of stack is: "+stack.peek());

        stack.display();

        System.out.println("The final size of a stack is: "+stack.size());
    }
}
