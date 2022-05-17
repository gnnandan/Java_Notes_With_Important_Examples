package _12_Data_Structures_In_Java._2_0_Queues;

class queue_Search
{
    private int arr[];
    private int size;
    private int rear;

    queue_Search(int size)
    {
        arr = new int[size];
        this.size=size;
        rear = -1;
    }

    public void enqueue(int newElement)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        rear++;
        arr[rear] = newElement;
    }


    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }

        int front = arr[0];
        for(int i=0;i<rear;i++)
        {
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        return arr[0];
    }

    public boolean isEmpty()
    {
        return rear==-1;
    }

    public boolean isFull()
    {
        return rear == size-1;
    }

    public int binarySearch(int find)
    {
        int mid;
        int low = 0;
        int high = arr.length-1;

        while(low<=high)
        {
            mid = low+(high-low)/2;

            if(arr[mid]==find)
            {
                return mid;
            }
            else if(arr[mid]>find)
            {
                high = mid-1;
            }
            else
            {
                low = mid +1;
            }
        }
        return -1;
    }
}

public class queue_searching_Example
{
    public static void main(String[] args)
    {
        queue_Search queues = new queue_Search(5);
        //adding elements
        queues.enqueue(111);
        queues.enqueue(222);
        queues.enqueue(333);
        queues.enqueue(444);
        queues.enqueue(555);

        System.out.println(queues.peek());

        System.out.println(queues.dequeue());

        int position = queues.binarySearch(111);
        if(position==-1)
        {
            System.out.println("The element not found");
        }
        else
        {
            System.out.println("The element found at position: "+position);
        }
    }
}
