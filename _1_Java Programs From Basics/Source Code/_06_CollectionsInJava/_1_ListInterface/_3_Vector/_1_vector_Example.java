package _06_CollectionsInJava._1_ListInterface._3_Vector;

import java.util.Vector;

public class _1_vector_Example
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

        //displaying the vector elements
        System.out.println("Vector: "+languages);

    }
}
