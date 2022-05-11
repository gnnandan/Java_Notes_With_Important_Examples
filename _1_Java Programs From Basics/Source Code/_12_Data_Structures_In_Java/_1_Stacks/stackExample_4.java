package _12_Data_Structures_In_Java._1_Stacks;

class stackOperation
{
    //variables
    private int size;
    private int arr[];
    private int top;

    //constructor
    stackOperation(int size)
    {
        arr = new int[size];
        this.size = size;
        top =0;
    }

    //important operation
    public void push(int newItem)
    {
        if(isFull())
        {
            System.out.println("Overflow: Stack is full, you can't add elements");
            System.exit(1);
        }

        //push operation logic
        arr[top++] = newItem;
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Underflow: stack is empty you can't pop elements");
            return -1;
        }

        //popping element logic
        return arr[--top];
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Underflow: stack is empty you can't pop elements");
            return -1;
        }

        return arr[top-1];
    }


    //specialized method to handle overflow and underflow
    public boolean isFull()
    {
        return top == size;
    }
    public boolean isEmpty()
    {
        return top == 0;
    }
}

public class stackExample_4
{
    public static void main(String[] args)
    {
        stackOperation data = new stackOperation(6);
        data.push(10);
        data.push(20);
        data.push(30);
        data.push(40);
        data.push(50);
//        data.push(50);
        data.pop();

        while(!data.isEmpty())
        {
            System.out.println(data.peek());
            data.pop();
        }
    }
}
