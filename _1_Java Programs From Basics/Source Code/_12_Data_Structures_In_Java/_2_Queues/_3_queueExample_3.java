package _12_Data_Structures_In_Java._2_Queues;

class queueOperation
{
    //variables
    private int size;
    private int arr[];
    private int end = -1;

    //constructor
    queueOperation(int size)
    {
        arr = new int[size];
        this.size = size;
    }


    //important operations
    public void enQueue(int newItem) //add
    {
        if(end == size-1)
        {
            System.out.println("Queue is full");
            return;
        }

        //logic to add element
        end++;
        arr[end] = newItem;
    }


    public int deQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }

        //logic to remove element
        int front = arr[0];
        for(int i=0;i<end;i++)
        {
            //after removing shift the elements
            arr[i] = arr[i+1];
        }
        end--;
        return front;
    }


    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
//            return -1;
        }

        //to display elements at front one by one
        while(!isEmpty())
        {
            System.out.println(arr[0]);
            deQueue();
        }

        //logic ro return the top most element
//        return arr[0];
    }

    //special method to check if the queue is empty
    public boolean isEmpty()
    {
        return end ==-1;
    }
}
public class _3_queueExample_3
{
    public static void main(String[] args)
    {
        queueOperation op = new queueOperation(5);

        //adding elements
        op.enQueue(100);
        op.enQueue(200);
        op.enQueue(300);
        op.enQueue(400);

        //remove element
        op.deQueue();

        //add element
        op.enQueue(666);

        //display front elements one by one
        op.peek();
    }
}
