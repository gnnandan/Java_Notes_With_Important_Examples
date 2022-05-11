package _09_Collections_In_Java._2_Queue_Type._02_Priority_Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class _3_iteratingOver_PriorityQueue_Example
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


//        way - 1 using 'iterator class'
        Iterator<String> languageList = languages.iterator();
        System.out.println("Iteration over Priority Queue using 'iterator class': ");
        while(languageList.hasNext())
        {
            System.out.println(languageList.next());
        }

        System.out.println();

//      way - 2 using for each
        System.out.println("Iteration over Priority Queue using 'for each': ");
        for(String languageData: languages)
        {
            System.out.println(languageData);
        }
    }
}
