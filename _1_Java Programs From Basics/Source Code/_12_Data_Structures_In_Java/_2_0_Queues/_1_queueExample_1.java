package _12_Data_Structures_In_Java._2_0_Queues;

class queue
{
    private int size;
    private int rear=-1;
    private int arr[];

    queue(int size)
    {
        arr = new int[size];
        this.size=size;
        System.out.println("The size of array: "+size);
    }

    public void add(int newItem)
    {
        //check if queue is full
        if(rear==size-1)
        {
            System.out.println("Queue is full");
            return;
        }

        rear++;
        arr[rear] =  newItem;
    }

    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }

        //remove element at first
        int front = arr[0];
        for(int i=0;i<rear;i++)
        {
            arr[i] = arr[i+1]; //shift after delete
        }

        rear--;
        return front;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("No element found");
            return -1;
        }
        return arr[0];
    }

    public boolean isEmpty()
    {
        return rear==-1;
    }
}

public class _1_queueExample_1
{
    public static void main(String[] args)
    {
        queue queue = new queue(5);
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);

        while(!queue.isEmpty())
        {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
