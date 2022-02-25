package _09_CollectionsInJava._2_Queue_Type._03_DeQueue_Interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class _01_implementing_ArrayDequeue_Using_Dequeue
{
    public static void main(String[] args)
    {
        // Creating DeQueue using the ArrayDeque class
        Deque<String> languages = new ArrayDeque<String>();

        //adding the elements using
        // add(), addFirst(), addLast()
        // offer(), offerFirst(), OfferLast()
        languages.add("Java");
        languages.addFirst("Python");
        languages.addLast("C++");
        languages.offer("C");
        languages.offerFirst("HTML");
        languages.offerLast("CSS");
        System.out.println("Array Dequeue elements: "+languages);


        //accessing dequeue elements
        //getFirst(), getLast()
        //peekFirst(), peekLast()
        System.out.println("Access first element: "+languages.getFirst());
        System.out.println("Access last element: "+languages.getLast());

        System.out.println("Access first element: "+languages.peek());

        System.out.println("Access first element: "+languages.peekFirst());
        System.out.println("Access last element: "+languages.peekLast());

        //removing the dequeue elements
        //removeFirst(), removeLast()
        //pollFirst(), pollLast()
        System.out.println("Remove first element: "+languages.removeFirst());
        System.out.println("Remove last element: "+languages.removeLast());

        System.out.println("Remove first element: "+languages.remove());

        System.out.println("Remove first element: "+languages.pollFirst());
        System.out.println("Remove last element: "+languages.pollLast());

        System.out.println("Updated Array Dequeue elements: "+languages);
    }
}
