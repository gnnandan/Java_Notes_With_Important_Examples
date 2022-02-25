package _09_CollectionsInJava._1_List_Type._4_Stack;

import java.util.Iterator;
import java.util.Stack;

public class _3_iteratingOver_Stack_Example
{
    public static void main(String[] args)
    {
        //creating a stack
        Stack<String> languages = new Stack<String>();

        //adding elements to stack
        languages.push("Java");
        languages.push("Python");
        languages.push("C");
        languages.push("C++");
        languages.push("SQL");

        //way - 1
        System.out.println("Iterating Over Stack Using 'foreach': ");
        for(String languageList: languages)
        {
            System.out.println(languageList);
        }

        System.out.println("\nIterating Over Stack Using 'iterator class': ");
        Iterator<String> languageListIteration = languages.iterator();
        while(languageListIteration.hasNext())
        {
            System.out.println(languageListIteration.next());
        }
    }
}
