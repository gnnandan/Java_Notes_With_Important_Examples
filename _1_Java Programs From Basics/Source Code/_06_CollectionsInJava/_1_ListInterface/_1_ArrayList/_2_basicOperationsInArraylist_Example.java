package _06_CollectionsInJava._1_ListInterface._1_ArrayList;

import java.util.ArrayList;


/**
 * @Basic-Operations
 * 1. Add elements
 * 2. Access elements
 * 3. Change elements
 * 4. Remove elements
 */
public class _2_basicOperationsInArraylist_Example
{
    public static void main(String[] args)
    {
        //      Creation Of ArrayList
        ArrayList<String> languages = new ArrayList<String>();

        //adding elements to arraylist
        languages.add("java");
        languages.add("python");
        languages.add("c#");
        languages.add("c++");
        languages.add("c");

        //access element
        System.out.println("Accessing array element: "+languages.get(3));

        //modify the arraylist element
        System.out.println("Modify the arraylist element: "+languages.set(2,"c-sharp"));
        System.out.println("After Modify: "+languages);

        //removing the arraylist element
        languages.add("null");
        System.out.println("Removing the element: "+languages.remove("null")); //language.remove(index)
        /**
         * @Note
         * use removeAll() or clear() -- to remove all element from arraylist
         */

        //displaying the content
        System.out.println("Updated ArrayList Elements: "+languages);
    }
}
