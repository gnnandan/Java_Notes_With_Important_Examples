package _12_Data_Structures_In_Java._1_0_Stacks;

class stack
{
    private int top;
    private int arr[];
    private int size;

    stack(int size)
    {
        arr = new int[size];
        top = 0;
        this.size = size;
    }

    public void push(int newItem)
    {
        if(isFull())
        {
            throw new IllegalStateException("Stack overflow: You can't add elements anymore");
        }
        else
        {
            arr[top++] = newItem;
        }
    }

    public int pop()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("Stack underflow: You can't pop elements anymore");
        }

        return arr[--top];
    }

    public void peek()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("Stack underflow: You can't pop elements anymore");
        }

        while(!isEmpty())
        {
            System.out.println(arr[top-1]);
            pop();
        }
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public boolean isFull()
    {
        return top == size;
    }
}

public class stackExample_5
{
    public static void main(String[] args)
    {
        stack newStack = new stack(5);
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        newStack.push(40);
        newStack.push(50);

        newStack.pop();

        newStack.peek();


    }
}
