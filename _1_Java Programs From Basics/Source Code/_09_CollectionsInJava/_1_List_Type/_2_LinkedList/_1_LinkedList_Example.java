package _09_CollectionsInJava._1_List_Type._2_LinkedList;

import java.util.LinkedList;

public class _1_LinkedList_Example
{
    public static void main(String[] args)
    {
        //creating a linkedlist
        LinkedList<String> languages = new LinkedList<String>();

        //adding elements to linkedlist
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("C");
        languages.add("SQL");

        //displaying the elements
        System.out.println("Linked List: "+languages);
    }
}
