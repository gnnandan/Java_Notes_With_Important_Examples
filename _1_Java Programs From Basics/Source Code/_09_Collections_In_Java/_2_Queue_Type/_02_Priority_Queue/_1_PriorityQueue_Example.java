package _09_Collections_In_Java._2_Queue_Type._02_Priority_Queue;


import java.util.PriorityQueue;

public class _1_PriorityQueue_Example
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

        //viewing the content
        System.out.println("Priority Queue Elements: "+languages);
    }
}
