package _09_Collections_In_Java._1_List_Type._1_ArrayList;

import java.util.ArrayList;

import java.util.Collections;


/**
@Note
    *Basic Methods*
 1. size() - Returns the length of the arraylist.
 2. sort() - Sort the arraylist elements.
 3. clone() - Creates a new arraylist with the same element, size, and capacity.
 4. contains() - Searches the arraylist for the specified element and returns a boolean result.
 5. ensureCapacity() - Specifies the total element the arraylist can contain.
 6. isEmpty() - Checks if the arraylist is empty.
 7. indexOf() - Searches a specified element in an arraylist and returns the index of the element.
 8. add() - to add element
 9. get() - returns the element present in the specified index
 10. set() - to modify or to replace an element
 11. addAll(int index, Collection c) - add all item from the collection to arrayList
 12. arraylist.subList(int fromIndex, int toIndex) - returns a portion of the arraylist
 13. retainAll() - retains only the common elements
 */
public class _4_arrayListMethods_Example
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

        //size
        System.out.println("size(): "+languages.size());

        //sort
        System.out.print("Sorting: ");
        Collections.sort(languages);
        for(String sorted: languages)
        {
            System.out.print(sorted+" ");
        }

        //clone
        ArrayList<String> clonedLanguages = (ArrayList<String>)languages.clone(); /** @NOTE */
        System.out.println("\nThe cloned languages are: "+clonedLanguages);

        //contains
        System.out.println("contains(): "+languages.contains("java"));

        //ensure capacity
        languages.ensureCapacity(3);
        System.out.println("capacity(): "+languages);

        //isEmpty
        System.out.println("isEmpty(): "+languages.isEmpty());

        //indexOf
        System.out.println("indexOf(): "+languages.indexOf("python"));

        //add all item
        ArrayList<String> nums= new ArrayList<>();
        nums.add("1");
        nums.add("2");
        nums.add("3");
        nums.addAll(languages);
        System.out.println("After addAll(): "+nums);

        //subList()
        System.out.println("sublist(): "+languages.subList(0,3));

        //retainALl()
        ArrayList<String> languageList1 = new ArrayList<String>();
        ArrayList<String> languageList2 = new ArrayList<String>();
        languageList1.add("java");
        languageList1.add("html");
        languageList1.add("css");
        languageList1.add("js");
        languageList1.add("sql");

        languageList2.add("python");
        languageList2.add("html");
        languageList2.add("css");
        languageList2.add("js");
        languageList2.add("sql");

        languageList1.retainAll(languageList2);
        System.out.println("'retainAll()' to get common elements in arraylist: "+languageList1);
    }
}
