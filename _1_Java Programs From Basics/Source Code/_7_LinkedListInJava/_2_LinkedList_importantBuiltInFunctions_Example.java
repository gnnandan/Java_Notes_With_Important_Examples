package _7_LinkedListInJava;

import java.util.LinkedList;

public class _2_LinkedList_importantBuiltInFunctions_Example
{
    public static void main(String[] args)
    {
        //creating LinkedList and allocating the memory
        LinkedList<String> data = new LinkedList<String>();

        //adding elements
        data.add("Nandan");
        data.add("Thejas");
        data.add("Darshan");
        data.add("Kunal");
        data.add("Yashas");

        //push
        data.push("New Data Is Pushed");
        System.out.println("LinkedList after using 'push': "+data);

        //pop
        data.pop();
        System.out.println("LinkedList after using 'pop': "+data);

        //remove
        System.out.println("LinkedList after using 'remove()': "+data.remove());
        System.out.println("LinkedList after using 'remove(int index)': "+data.remove(0));
        System.out.println("LinkedList after using 'remove(object)': "+data.remove("Darshan"));
        System.out.println("The remaining elements are: "+data);

        //adding element at first
        data.addFirst("Nandan");
        System.out.println("after using 'addFirst': "+data);

        //adding element at last
        data.addLast("Ganesh");
        System.out.println("after using 'addLast': "+data);

        //getting first element
        System.out.println("getting first element using 'getFirst': "+data.getFirst());

        //getting last element
        System.out.println("getting last element using 'getLast': "+data.getLast());

        //removing first element
        System.out.println("removing first element using 'removeFirst': "+data.removeFirst());

        //removing last element
        System.out.println("removing last element using 'removeLast': "+data.removeLast());

        //clearing the linked list
        data.clear();
        System.out.println("after using 'clear': "+data);
    }
}
