package _09_CollectionsInJava._2_Queue_Type._02_Priority_Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class _6_takingPriorityQueue_Input_string_Example
{
    public static void main(String[] args)
    {
        PriorityQueue<String> languages = new PriorityQueue<String>();
        Scanner inputString = new Scanner(System.in);

        System.out.print("Enter the length of the priority queue: ");
        int len = inputString.nextInt();
        for(int i=0;i<len+1;i++)
        {
            System.out.print("Enter the "+len+" elements one by one to insert into priority queue: ");
            String elements = inputString.next();
            languages.offer(elements);
        }

        System.out.println("The priority queue elements: "+languages);
        System.out.println("The size of priority queue: "+languages.size());
        System.out.println("The element at the top of priority queue: "+languages.peek());
    }
}
