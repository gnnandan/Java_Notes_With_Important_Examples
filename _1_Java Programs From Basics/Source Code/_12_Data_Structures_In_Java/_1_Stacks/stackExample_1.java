package _12_Data_Structures_In_Java._1_Stacks;

class basicStack<x>
{
    private x[] data;
    private int stackPointer;

    //initializing the values
    public basicStack()
    {
        data = (x[]) new Object[1000];
        stackPointer = 0;
    }

    public void push(x newItem)
    {
        data[stackPointer++]= newItem;
    }

    public x pop() //return the popped element
    {
        if(stackPointer ==0)
        {
            throw new IllegalStateException("No more items on the stack");
        }
        return data[--stackPointer]; //if items pop it
    }

    public boolean contains(x item)
    {
        boolean found = false;

        //loop to find
        for(int i=0;i<stackPointer;i++)
        {
            if(data[i].equals(item))
            {
                found = true;
                break;
            }
        }
        return found;
    }

    public x access(x item)
    {
        while (stackPointer>0)
        {
            x tempItem = pop();
            if(item.equals(tempItem))
            {
                return tempItem;
            }
        }
        throw new IllegalStateException("Item Couldn't find on stack: "+item);
    }

    public int size()
    {
        return stackPointer;
    }
}
public class stackExample_1
{
    public static void main(String[] args)
    {
        basicStack<String> app = new basicStack<String>();

        app.push("Nandan");
        app.push("Yashas");
        app.push("Pavan");
        app.push("Ganesh");

        System.out.println("Popping element: "+app.pop());

        System.out.println("Size of stack: "+app.size());
        System.out.println("Contains item: "+app.contains("Nandan")+" found..!");
        System.out.println("Accessing item: "+app.access("Nandan"));
    }
}
