package _08_LinkedListInJava;

import java.util.LinkedList;

public class _1_linkedListSimple_Example
{
    public static void main(String[] args)
    {
        //Declaration & Memory Allocation
        LinkedList<String> data = new LinkedList<String>();

        data.add("Nandan");
        data.add("Thejas");
        data.add("Darshan");
        data.add("Kunal");
        data.add("Yashas");

        //displaying the data
        System.out.println("The data's are: "+data);

        //checking size of the LinkedList
        System.out.println("Checking the size of LinkedList: "+data.size());

        //checking if the element contains or not
        System.out.println("Checking the string is present or not: "+data.contains("Nandan"));

        //cloning the LinkedList
        System.out.println("Cloning the linked list: "+data.clone());

        //checking the index of the LinkedList element
        System.out.println("Checking Index: "+data.indexOf("Nandan"));
    }
}
