package _1_Data_Structures._3_Stack;

class stackCustomImplementation
{
    int arr[];
    int top=-1;
    int capacity;

    stackCustomImplementation(int size)
    {
        this.capacity = size;

        //initializing size of stack
        arr = new int[capacity];
    }

    //pushing procedure
    void push(int item) throws Exception
    {
        //OVERFLOW HANDLING
        if(top== arr.length-1)
        {
            throw new Exception("Stack is overflow...!");
        }
        else
        {
            top++;
            arr[top] = item;
        }
    }

    //popping procedure
    int pop() throws Exception
    {
        //UNDERFLOW HANDLING
        if(top==-1)
        {
            throw new Exception("Stack is underflow...!");
        }
        int removed = arr[top--];
//        top--;
        return removed;
    }

    //returning top most element in a stack
    int peek() throws Exception
    {
        //UNDERFLOW HANDLING
        int topElement=-1;
        if(top==-1)
        {
            throw new Exception("Stack is underflow...!");
        }
        else
        {
            topElement = arr[top];
        }
        return topElement;
    }

    //displaying an array
    void display()
    {
        //remembering the logic
        for(int i=0;i<= top;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //to get size when each operation is carried out
    int size()
    {
        return top;
    }
}

public class _3_Stack_Custom_Implementation_Example
{
    public static void main(String[] args) throws Exception
    {
        stackCustomImplementation stacks = new stackCustomImplementation(6);

        stacks.push(10);
        System.out.println("Push() at index: "+stacks.size()+" So the top of stack: "+stacks.peek());

        stacks.push(20);
        System.out.println("Push() at index: "+stacks.size()+" So the top of stack: "+stacks.peek());

        stacks.push(30);
        System.out.println("Push() at index: "+stacks.size()+" So the top of stack: "+stacks.peek());

        stacks.push(40);
        System.out.println("Push() at index: "+stacks.size()+" So the top of stack: "+stacks.peek());

        stacks.push(50);
        System.out.println("Push() at index: "+stacks.size()+" So the top of stack: "+stacks.peek());

        System.out.print("\nAfter set of push() operations: ");
        stacks.display();


        System.out.println("\nPop() Operation from index: "+stacks.size()+" and the element of stack is: "+stacks.pop());  //popping an element from the stack {Returns popping element index and popping item}

        System.out.print("The remaining elements are after popping: ");
        stacks.display();


        System.out.println();


        stacks.push(100);
        System.out.println("Push() at index: "+stacks.size()+" So the top of stack: "+stacks.peek());

        stacks.push(1000);
        System.out.println("Push() at index: "+stacks.size()+" So the top of stack: "+stacks.peek());

        System.out.print("\nThe final elements are: ");
        stacks.display();

        System.out.println("The final size of stack: "+stacks.size());
        System.out.println("The element at the top of stack is: "+stacks.peek());
    }
}
