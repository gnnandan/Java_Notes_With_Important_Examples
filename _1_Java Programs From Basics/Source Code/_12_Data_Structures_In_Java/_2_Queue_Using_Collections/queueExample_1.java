package _12_Data_Structures_In_Java._2_Queue_Using_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queueExample_1
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(100);//enqueue ---> Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);

        queue.remove(); //dequeue ----> Retrieves and removes the head of this queue
        queue.poll(); //dequeue ----> Retrieves, but does not remove, the head of this queue

        queue.offer(100); //enqueue ---->adds the specified element at the end of the linked list
        queue.offer(200); //enqueue
        queue.add(1234); //enqueue

        System.out.println("The front element: "+queue.peek()); //----> returns the first element (head) of the linked list
        System.out.println("The front element: "+queue.element()); //---> returns and removes the first element from the linked list

        System.out.println(queue); //display queue elements

        //iterate over queue
        Iterator<Integer> itet = queue.iterator();
        while ((itet.hasNext()))
        {
            System.out.println(itet.next());
        }
    }
}
