package _09_CollectionsInJava._2_Queue_Type._02_Priority_Queue;

import java.util.PriorityQueue;

public class _4_convertion_PriorityQueue_to_Array_Example
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

        //logic to convert priority queue to array
        // object holds the conversion
        Object languagesArray[] = languages.toArray();
        System.out.print("The arrays are: ");
        for(int i=0;i< languagesArray.length;i++)
        {
            System.out.print(languagesArray[i]+" ");
        }

    }
}
