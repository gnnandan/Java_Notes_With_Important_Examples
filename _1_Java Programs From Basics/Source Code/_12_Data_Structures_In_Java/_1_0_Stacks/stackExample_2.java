package _12_Data_Structures_In_Java._1_0_Stacks;

class stackClass<x>
{
    private x data[];
    private int stackSize;
    private int stackPointer;

    public stackClass(int stackSize) //constructor
    {
        data = (x[]) new Object[stackSize]; //declare stack size
        stackPointer = 0; //initially pointer is 0
    }

   //push element
    public void push(x newItem)
    {
        if(stackPointer == data.length) //to check stack overflow
        {
            System.out.println("stack is overflow: you can't push above the size of an array");
            System.exit(1);
        }
        else
        {
            data[stackPointer++] = newItem;
        }
    }

   //display elements
    public void display()
    {
        for(int i=0;i<stackPointer;i++)
        {
            System.out.println(data[i]);
        }
    }

    //pop element
    public x pop()
    {
        if(stackPointer==0)
        {
            throw new IllegalStateException("There is no elements to pop");
        }
        return data[--stackPointer];
    }

    //return top element
    public x peek()
    {
        if(stackPointer==0)
        {
            throw new IllegalStateException("There is no element on the top");
        }
        return data[stackPointer-1];
    }

    //return size of an array
    public int size()
    {
        return stackPointer;
    }
}
public class stackExample_2
{
    public static void main(String[] args)
    {
        stackClass ele = new stackClass(3);
        ele.push("Nandan"); //push1
        ele.push("Yashas"); //push2
        ele.push("Test 1"); //push3
        //ele.push("Test 2"); //push4

        System.out.println("Size of stack after first set of push(): "+ele.size()); //print size

        System.out.println("\nPopped element: "+  ele.pop()); //pop1
//        System.out.println("Popped element: "+  ele.pop());//pop2
//        System.out.println("Popped element: "+  ele.pop());//pop3

        System.out.println("The elements are: "); //display
        ele.display();

        System.out.println("\nThe element at the top: "+  ele.peek());//return top element

        ele.pop();
        ele.display();

        System.out.println("\nThe size of stack after all operation: "+ele.size());
    }
}
