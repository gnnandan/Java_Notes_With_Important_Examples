package _06_CollectionsInJava._1_ListInterface._4_StackInJava;

import java.util.Stack;

/**
 * @Basic-Operations
 * 1. Add elements  - push()
 * 2. Access elements - get()
 * 3. Change elements - set()
 * 4. Remove elements - pop()
 */

public class _2_basicOperations_In_stack_Example
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

        //accessing the element
        System.out.println("Accessing the element: "+languages.get(3));

        //modifying the element
        languages.set(0,"JAVA");
        System.out.println("Modifying the element in stack: "+languages);

        //removing the element
        languages.pop();
        System.out.println("After removing the element: "+languages);

        //displaying the stack elements
        System.out.println("Final Stack elements: "+languages);
    }
}
