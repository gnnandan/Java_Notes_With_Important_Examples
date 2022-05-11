package _09_Collections_In_Java._2_Queue_Type._01_Queue_Interface;

import java.util.ArrayDeque;
import java.util.Queue;

public class _03_implementing_ArrayDequeue_Using_Queue
{
    public static void main(String[] args)
    {

        // Creating Queue using the LinkedList class
        Queue<String> languages = new ArrayDeque<>();

        //offer elements to queue
        languages.offer("Java");
        languages.offer("Python");
        languages.offer("C++");
        languages.offer("C");

        System.out.println("After adding elements into the queue: "+languages);

        //accessing the elements
        String accessHeadElement = languages.peek();
        System.out.println("The element at the top: "+accessHeadElement);

        //removing the element
        String removeHeadElement = languages.poll();
        System.out.println("The removed element is: "+removeHeadElement);

        System.out.println("The updated queue is "+languages);
    }
}
