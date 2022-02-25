package _09_CollectionsInJava._1_List_Type._3_Vector;

import java.util.Iterator;
import java.util.Vector;

public class _3_iteratingOverVector_Example
{
    public static void main(String[] args)
    {
        //creating a vector
        Vector<String> languages = new Vector<String>();

        //adding elements to vector
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("C");
        languages.add("SQL");

        //way - 1
        System.out.println("Iterating Over Vector Using 'foreach': ");
        for(String languagesList: languages)
        {
            System.out.println(languagesList);
        }

        System.out.println("\nIterating Over Vector Using 'iterator class': ");
        Iterator<String> languageListIteration = languages.iterator();
        while (languageListIteration.hasNext())
        {
            System.out.println(languageListIteration.next());
        }
    }
}
