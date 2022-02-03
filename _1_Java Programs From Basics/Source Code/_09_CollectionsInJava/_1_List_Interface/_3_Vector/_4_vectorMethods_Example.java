package _09_CollectionsInJava._1_List_Interface._3_Vector;

import java.util.Vector;

/**
@Important Methods
add() - adds element to the vector
set() - used to modify the element of the vector
get() - used to get the element of the vector
remove() - used to remove the element from the vector
contains() - 	checks if the vector contains the element
size() - checks the size of vector
toArray() - used to convert vector to array
toString() - used to convert vector to string
clear() - used to clear the vector
removeAll() - removes all the element of the vector
*/
public class _4_vectorMethods_Example
{
    public static void main(String[] args)
    {
        //creating a vector
        Vector<String> languages = new Vector<String>();

        //add()
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("C");
        languages.add("SQL");

        //set()
        languages.set(4,"HTML");
        System.out.println("After set(): "+languages);

        //get()
        System.out.println("After get(): "+languages.get(3));

        //contains()
        System.out.println("After contains(): "+languages.contains("HTML"));

        //size()
        System.out.println("After size(): "+languages.size());

        //toArray()
        String languagesArray[] = new String[languages.size()];
        languages.toArray(languagesArray);
        System.out.println("Afet conversion of vector to array: ");
        for(String arrayData: languagesArray)
        {
            System.out.println(arrayData);
        }

        System.out.println();

        //toString
        String languageString  = languages.toString();
        System.out.println("After converting toString: "+languageString);

        //remove
        languages.remove("HTML"); //languages.remove(4);
        System.out.println("After removing: "+languages);

        //removeAll() or clear()
        languages.removeAll(languages);
        System.out.println("After removeAll: "+languages);

        languages.clear();
        System.out.println("After clear: "+languages);

    }
}
