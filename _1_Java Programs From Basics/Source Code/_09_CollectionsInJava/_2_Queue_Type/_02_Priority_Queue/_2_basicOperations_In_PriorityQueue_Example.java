package _09_CollectionsInJava._2_Queue_Type._02_Priority_Queue;

import java.util.PriorityQueue;
/**
 * @Basic-Operations
 * 1. Add elements  - add(), offer()
 * 2. Access elements - peek(), element()
 * 3. Remove elements - remove(), poll()
 */
public class _2_basicOperations_In_PriorityQueue_Example
{
    public static void main(String[] args)
    {
        //Creation Of PriorityQueue
        PriorityQueue<String> languages = new PriorityQueue<String>();

        //adding elements to PriorityQueue
        languages.offer("java");
        languages.offer("python");
        languages.offer("c#");
        languages.offer("c++");
        languages.offer("c");
        System.out.println("Priority Queue Elements: "+languages);


        //element() and peek()
        System.out.println("Accessing the top element using 'element()': "+languages.element());
        System.out.println("Accessing the top element using 'peek()': "+languages.peek());

        //remove() and poll()
        System.out.println("removing the top element using 'remove()': "+languages.remove());
        System.out.println("removing the top element using 'poll()': "+languages.poll());

        //viewing the content
        System.out.println("Updated Priority Queue Elements: "+languages);
    }
}
