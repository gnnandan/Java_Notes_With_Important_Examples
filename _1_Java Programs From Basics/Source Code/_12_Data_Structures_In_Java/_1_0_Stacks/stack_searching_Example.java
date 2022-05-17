package _12_Data_Structures_In_Java._1_0_Stacks;
class stack_Search
{
    private String arr[];
    private int top;
    private int size;

    stack_Search(int size)
    {
        arr = new String[size];
        this.size=size;
        top = 0;
    }

    public void push(String newElement)
    {
        if(isFull())
        {
            System.out.println("Stack is overflow: You can't push anymore");
        }
        else
        {
            arr[top++] = newElement;
        }
    }

    public String pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is underflow: you can't pop anymore");
        }
        return arr[--top];
    }

    public String peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is underflow: no element found");
        }
        return arr[top-1];
    }

    //specialized method
    public boolean isEmpty()
    {
        return top == 0;
    }

    public boolean isFull()
    {
        return top == size;
    }

    public int linearSearch(String find)
    {
        for(int i=0;i<top;i++)
        {
            if(arr[i]==find)
            {
                return i;
            }
        }
        return -1;
    }
}
public class stack_searching_Example
{
    public static void main(String[] args)
    {
        stack_Search operation = new stack_Search(5);
        operation.push("aaa");
        operation.push("bbb");
        operation.push("ccc");
        operation.push("ddd");
        operation.push("eee");

        operation.pop(); //eee
        operation.peek(); //returns top most element: ddd

        //operation.pop(); //ddd


        int position = operation.linearSearch("ccc");
        System.out.println("The element found at position: "+position);

    }

}
