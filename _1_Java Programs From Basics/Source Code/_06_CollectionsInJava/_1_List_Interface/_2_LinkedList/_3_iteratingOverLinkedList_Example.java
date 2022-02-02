package _06_CollectionsInJava._1_List_Interface._2_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class _3_iteratingOverLinkedList_Example
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


        //way - 1
        System.out.println("Iterating Over LinkedList Using 'foreach': ");
        for(String languageList: languages)
        {
            System.out.println(languageList);
        }

        System.out.println("\nIterating Over LinkedList Using 'iterator class': ");
        Iterator<String> languageListIteration = languages.iterator();
        while(languageListIteration.hasNext())
        {
            System.out.println(languageListIteration.next());
        }

    }
}
