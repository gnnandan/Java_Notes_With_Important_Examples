package _09_CollectionsInJava._1_List_Interface._2_LinkedList;

import java.util.LinkedList;

/**
 @Important Methods
 ********************** BASIC ****************************************
 add() - adds element to the linkedlist
 set() - used to modify th element of the linked list elements
 get() - used to get the element of the linked list elements
 remove() - used to remove the element from the linked list elements
 contains() - 	checks if the LinkedList contains the element
 indexOf()	- returns the index of the first occurrence of the element
 lastIndexOf()	- returns the index of the last occurrence of the element
 clear() - removes all the elements of the LinkedList
 iterator() - returns an iterator to iterate over LinkedList

 ******************** ADVANCED WHICH HELPS IN QUEUE OPERATION ***************************************
 addFirst() - adds the specified element at the beginning of the linked list
 addLast() - adds the specified element at the end of the linked list
 getFirst() - returns the first element
 getLast() - returns the last element
 removeFirst() - removes the first element
 removeLast() - removes the last element
 peek() - returns the first element (head) of the linked list
 poll() - returns and removes the first element from the linked list
 offer() - adds the specified element at the end of the linked list
 */

public class _4_linkedListMethods_Example
{
    public static void main(String[] args)
    {
        System.out.println("********************** BASIC ****************************************");
        //creating a linkedlist
        LinkedList<String> languages = new LinkedList<String>();

        //adding elements to linkedlist without index
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("C");
        languages.add("SQL");

        //add()
        System.out.println("After add(): "+languages);

        //get()
        System.out.println("After get(): "+languages.get(1));

        //set()
        String set = languages.set(0,"JAVA");
        System.out.println("After set(): "+set);
        System.out.println("The elements of linked list after set(): "+languages);

        //contains()
        System.out.println("After contains(): "+languages.contains("JAVA"));

        //indexOf()
        System.out.println("After indexOf(): "+languages.indexOf("JAVA"));

        //lastIndexOf()
        System.out.println("After lastIndexOf(): "+languages.lastIndexOf("JAVA"));

        //remove()
        System.out.println("After remove(): "+languages.remove("C++"));
        System.out.println("The elements of linked list after remove(): "+languages);

        //clear()
        languages.clear();
        System.out.println("After clear(): "+languages);

        System.out.println("**************** ADVANCED WHICH HELPS IN QUEUE OPERATION *******************");
        //creating a linkedlist
        LinkedList<String> animals = new LinkedList<String>();

        //adding elements to linkedlist without index
        animals.add("Cow");
        animals.add("Dog");
        animals.add("Cat");

        //addFirst() & addLast()
        animals.addFirst("Deer");
        System.out.println("After addFirst(): "+animals);
        animals.addLast("Antelope");
        System.out.println("After addList(): "+animals);

        //getFirst() & getLast()
        System.out.println("After getFirst(): "+animals.getFirst());
        System.out.println("After getList(): "+animals.getLast());

        //peek(), peekFirst(), & peekLast()
        System.out.println("After peek(): "+animals.peek());
        System.out.println("After peekFirst(): "+animals.peekFirst());
        System.out.println("After peekLast(): "+animals.peekLast());

        //offer(),  offerFirst(), & offerLast()
        System.out.println("After offer(): "+animals.offer("Bull"));
        System.out.println("After offerFirst(): "+animals.offerFirst("Zebra"));
        System.out.println("After offerLast(): "+animals.offerLast("Elephant"));
        System.out.println("After offer(), offerFirst(), offerLast(): "+animals);

        //removeFirst() & removeLast()
        System.out.println("After removeFirst(): "+animals.removeFirst());
        System.out.println("After removeLast(): "+animals.removeLast());
        System.out.println("After removeFirst(), removeLast(): "+animals);
    }
}
