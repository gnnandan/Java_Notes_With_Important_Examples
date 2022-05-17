package _12_Data_Structures_In_Java._2_0_Queues;

class queues
{
    private int arr[];
    private int size;
    private int end;

    queues(int size)
    {
        arr = new int[size];
        this.size=size;
        end=-1;
    }

    public void add(int newElement)
    {
        if(isFull())
        {
            throw new IllegalStateException("Queue Full: You can't add elements anymore");
        }
        else
        {
            end++;
            arr[end]= newElement;
        }
    }
    public int remove()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("Queue Empty: You can't remove elements anymore");
        }
        //remove and shift the front element
        int front = arr[0];
        for(int i=0;i<end;i++)
        {
            arr[i] = arr[i+1];
        }

        end--;
        return front;
    }

    public void peek()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("Queue Empty: You can't remove elements anymore");
        }

        int pos = 0;
        while(!isEmpty())
        {
            System.out.println("Queue element at position: "+pos+" item: "+arr[0]);
            remove();
            pos++;
        }
    }


    public boolean isEmpty()
    {
        return end == -1;
    }

    public boolean isFull()
    {
        return end == size-1;
    }
}
public class queueExample_4
{
    public static void main(String[] args)
    {
        queues queues = new queues(5);
        //adding elements
        queues.add(100);
        queues.add(200);
        queues.add(300);
        queues.add(400);
        queues.add(500);

        queues.remove();
        queues.peek();
    }
}
