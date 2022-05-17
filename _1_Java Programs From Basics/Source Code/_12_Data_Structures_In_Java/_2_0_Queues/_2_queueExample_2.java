package _12_Data_Structures_In_Java._2_0_Queues;

public class _2_queueExample_2
{
    static class queue
    {
        static int arr[];
        static int size;
        static int rear = -1;

        queue(int size)
        {
            arr = new int[size];
            queue.size = size;
        }


        //adding - enqueue
        public static void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("Queue is full");
                return;
            }
            //add element
            //first increase the rear index and add the elements
            rear++;
            arr[rear]= data;
        }

        //delete - dequeue
        public static int remove()
        {
            if(rear==-1)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            //as queue deletes from front so consider arr[0]
            int front = arr[0];
            //after delete shift the position
            for(int i=0;i<rear;i++) //BIG - O -> O(n) to avoid this we use circular queue
            {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek()
        {
            if(rear==-1)
            {
                System.out.println("Queue is empty");
                return -1;
            }

            //return the front element
            return arr[0];
        }

        public static boolean isEmpty()
        {
            return rear==-1;
        }
    }


    public static void main(String[] args)
    {
        queue queue = new queue(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        //display
        while(!_2_queueExample_2.queue.isEmpty())
        {
            System.out.println(_2_queueExample_2.queue.peek());
            _2_queueExample_2.queue.remove();
        }
    }
}
