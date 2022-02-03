package _09_CollectionsInJava._2_Queue_Interface._02_Priority_Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class _7_takingPriorityQueue_Input_int_Example
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> favourNumbers = new PriorityQueue<Integer>();
        Scanner inputString = new Scanner(System.in);

        System.out.print("Enter the length of the priority queue: ");
        int len = inputString.nextInt();
        for(int i=0;i<len+1;i++)
        {
            System.out.print("Enter the "+len+" elements one by one to insert into priority queue: ");
            int elements = inputString.nextInt();
            favourNumbers.offer(elements);
        }

        System.out.println("The priority queue elements: "+favourNumbers);
        System.out.println("The size of priority queue: "+favourNumbers.size());
        System.out.println("The element at the top of priority queue: "+favourNumbers.peek());
    }
}
