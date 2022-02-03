package _09_CollectionsInJava._1_List_Interface._3_Vector;

import java.util.Vector;

/**
 * @Basic-Operations
 * 1. Add elements  - add()
 * 2. Access elements - get()
 * 3. Change elements - set()
 * 4. Remove elements - remove()
 */
public class _2_basicOperations_In_vector_Example
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

        //adding elements in specified position
        languages.add(4,"HTML");
        System.out.println("After adding elements: "+languages);

        //accessing the elements
        System.out.println("Element in index '3': "+languages.get(3));

        //modifying the element
        languages.set(0,"JAVA");
        System.out.println("After modification: "+languages);

        //removing
        languages.remove("HTML"); // or languages.remove(4);
        System.out.println("After removing: "+languages);

        //displaying the vector elements
        System.out.println("Final Vector Elements: "+languages);
    }
}
