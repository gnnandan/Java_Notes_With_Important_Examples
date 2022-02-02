package _06_CollectionsInJava._1_List_Interface._2_LinkedList;

import java.util.LinkedList;

/**
 * @Basic-Operations
 * 1. Add elements  --add()
 * 2. Access elements --get()
 * 3. Change elements --set()
 * 4. Remove elements --remove()
 */
public class _2_basicOperations_In_Linkedlist_Example
{
    public static void main(String[] args)
    {
        //creating a linkedlist
        LinkedList<String> languages = new LinkedList<String>();

        //adding elements to linkedlist without index
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("C");
        languages.add("SQL");

        //adding elements to linkedlist without index
        languages.add(1,"Apex");

        //accessing the element
        String data = languages.get(1);
        System.out.println("Accessing the element at index 1: "+data);

        //modifying the element
        String mod = languages.set(0,"JAVA");
        System.out.println("After modifying the element of linkedlist: "+mod);

        //removing the element
        String remove = languages.remove(1); // or languages.remove("Apex")
        System.out.println("After removing the element in linkedlist: "+remove);

        //displaying the elements
        System.out.println("Linked List: "+languages);
    }
}
