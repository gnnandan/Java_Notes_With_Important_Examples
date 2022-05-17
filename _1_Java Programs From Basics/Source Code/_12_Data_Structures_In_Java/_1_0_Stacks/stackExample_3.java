package _12_Data_Structures_In_Java._1_0_Stacks;

class stackClassExample<type>
{
    private int stackPointer;
    private type[] data;

    stackClassExample() //constructor
    {
        stackPointer=0;
        data = (type[]) new Object[5]; //typecast
    }

    //pushing element
    public void push(type newElement)
    {
        if(stackPointer== data.length)
        {
            throw new IllegalStateException("Overflow Occurred");
        }
        else
        {
            //adding element into the stack
            data[stackPointer++] = newElement;//post increment add element
        }
    }

    //popping element
    public type pop()
    {
        if(stackPointer== data.length-1)
        {
            throw new IllegalStateException("Underflow occurred");
        }
        return data[--stackPointer];
    }

    //display
    public void display()
    {
//        System.out.println("The elements of the stack: "+ Arrays.toString(data));
        for(int i=0;i<stackPointer;i++)
        {
            System.out.println(data[i]);
        }
    }

    //element existence
    public boolean contains(type element)
    {
        boolean found = false;
        for(int i=0;i<stackPointer;i++)
        {
            if(data[i].equals(element))
            {
                found = true;
                break;
            }
        }
        return found;
    }
}

public class stackExample_3
{
    public static void main(String[] args)
    {
        stackClassExample<Integer> data = new stackClassExample<Integer>();
        data.push(10);
        data.push(20);
        data.push(30);
        data.push(40);
        data.push(50);

        data.pop(); //popped element

        data.display();

        System.out.println("Element found? "+data.contains(30));
    }
}
