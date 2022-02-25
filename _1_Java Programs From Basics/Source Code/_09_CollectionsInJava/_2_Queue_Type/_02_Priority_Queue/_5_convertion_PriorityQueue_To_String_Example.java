package _09_CollectionsInJava._2_Queue_Type._02_Priority_Queue;

import java.util.PriorityQueue;

public class _5_convertion_PriorityQueue_To_String_Example
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

        System.out.println("Priority Queue: "+languages);

        //logic to convert priority queue to string
        // object holds the conversion
        String languagesString = languages.toString();
        System.out.println("Strings are: " + languagesString);
    }
}
