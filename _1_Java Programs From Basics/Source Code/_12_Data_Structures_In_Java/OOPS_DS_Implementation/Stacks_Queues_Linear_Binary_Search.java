package _12_Data_Structures_In_Java.OOPS_DS_Implementation;

import java.util.Scanner;

//a complete data structures & algorithm of PHASE - 1 learnt
class operation
{
    //common global variables
    private static int[] arr;
    private static int top; //stack pointer
    private static int end=-1; //queue pointer

    //stack class
    static class stack
    {

        private final int size;

        stack(int size)
        {
            arr = new int[size];
            this.size=size;
            top=0;
        }

        //specialized methods
        public boolean isEmpty() //to check if stack is empty
        {
            return top==0;
        }

        public boolean isFull() //to check if stack is full
        {
            return top ==size;
        }

        //push operation
        public void push(int newElement)
        {
            if(isFull())
            {
                System.out.println("Stack is overflow: can't able push");
                System.exit(1);
            }
            else
            {
                arr[top++] = newElement;
            }
        }

        //pop operation
        public int pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack is underflow: can't able to pop");
                System.exit(1);
            }
            return arr[--top]; //pop element
        }

        //peek(display top most element)
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Stack is underflow: No element found at the top");
                System.exit(1);
            }
            return arr[top-1];
        }

        //display all elements
        public void displayStack()
        {
            int pos=0;
            for(int i=top-1;i>=0;i--)
            {
                System.out.println("STACK position at "+pos+" Element: "+arr[i]);
                pos++;
            }
        }
    }

    //queue class
    static class queue
    {
        private final int size;
        queue(int size)
        {
            arr = new int[size];
            this.size = size;
        }

        //specialized method
        public boolean isEmpty()
        {
            return end == -1;
        }

        public boolean isFull()
        {
            return end == size-1;
        }

        //adding element to queue
        public void enQueue(int newElement)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                System.exit(1);
            }
            else
            {
                end++;
                arr[end] = newElement;
            }
        }

        //removing the element
        public int deQueue()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                System.exit(1);
            }

            int front = arr[0];
            for(int i=0;i<end;i++)
            {
                //shift the position after removing the element
                arr[i] = arr[i+1];
            }
            end--;
            return front; //return the removed element
        }

        //return top most element
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                System.exit(1);
            }
            return arr[0]; //return the top most element
        }

        //display elements
        public void displayQueue()
        {
            for(int i=0;i<=end;i++)
            {
                System.out.println("QUEUE position at "+i+" Element: "+arr[i]);
            }
        }
    }

    //Linear Search class
    static class linearSearch
    {
        public int linearSearchStackOperation(int find)
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

        public int linearSearchQueueOperation(int find)
        {
            for(int i=0;i<= end;i++)
            {
                if(arr[i]==find)
                {
                    return i;
                }
            }
            return -1;
        }
    }

    //binary Search class
    static class binarySearch
    {
        private int low=0;
        private int high = arr.length-1;
        private int mid;
        public int binarySearchStack(int find)
        {
            while (low<= high)
            {
                mid = (low+ high)/2;

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
                    low = mid+1;
                }
            }
            return -1;
        }

        public int binarySearchQueue(int find)
        {
            while(low<= high)
            {
                mid = (low+ high)/2;

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
                    low = mid+1;
                }
            }
            return -1;
        }
    }
}


// main class
public class Stacks_Queues_Linear_Binary_Search
{
    public static void main(String[] args)
    {
        //stack class
        stackClassMethod(5);

        System.out.println("******************************************************");

        //queue class
        queueClassMethod(5);

        //algorithm to find the element presence
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number from 100 to 500 to find its position using Linear Search: ");
        int find = scanner.nextInt();
        linearSearchMethod(find);

        System.out.println("******************************************************");
        System.out.print("Enter the number from 100 to 500 to find its position using Binary Search: ");
        int find_2 = scanner.nextInt();
        binarySearchMethod(find_2);
    }

    //stack class method to drive operations
    static void stackClassMethod(int size)
    {
        operation.stack stack  = new operation.stack(size);
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);

        System.out.println("The top element of stack is: "+stack.peek());
        stack.displayStack();

        stack.pop();
        stack.pop();
        System.out.println("The top element of stack AFTER POP is: "+stack.peek());
        System.out.println("The remaining element in stack: ");
        stack.displayStack();
    }

    //queue class method to drive operations
    static void queueClassMethod(int size)
    {
        operation.queue queue = new operation.queue(size);
        queue.enQueue(100);
        queue.enQueue(200);
        queue.enQueue(300);
        queue.enQueue(400);
        queue.enQueue(500);

        System.out.println("The front element of queue is: "+queue.peek());
        queue.displayQueue();

        queue.deQueue();
//        queue.deQueue();
        System.out.println("The front element of queue AFTER POP is: "+queue.peek());
        System.out.println("The remaining element in queue: ");
        queue.displayQueue();
    }

    //linearSearchMethod class method to drive operations
    //linearSearchMethod
    static void linearSearchMethod(int find)
    {
        operation.linearSearch linearSearch = new operation.linearSearch();
        //find element position in stack
        int stack_position = linearSearch.linearSearchStackOperation(find);
        if(stack_position ==-1)
        {
            System.out.println(find+ " Not found");
        }
        else
        {
            System.out.println(find+" found at stack_position: "+ stack_position);
        }

        //find element position in queue
        int queue_position = linearSearch.linearSearchQueueOperation(find);
        if(queue_position ==-1)
        {
            System.out.println(find+ " Not found");
        }
        else
        {
            System.out.println(find+" found at queue_position: "+ queue_position);
        }
    }

    //binarySearchMethod class method to drive operations
    //binarySearchMethod
    static void binarySearchMethod(int find)
    {
        operation.binarySearch bs = new operation.binarySearch();
        int stack_position = bs.binarySearchStack(find);
        if(stack_position ==-1)
        {
            System.out.println(find+ " Not found");
        }
        else
        {
            System.out.println(find+" found at stack_position: "+ stack_position);
        }

        //find element position in queue
        int queue_position = bs.binarySearchQueue(find);
        if(queue_position ==-1)
        {
            System.out.println(find+ " Not found");
        }
        else
        {
            System.out.println(find+" found at queue_position: "+ queue_position);
        }

    }
}
//TODO-> Need to de code optimization