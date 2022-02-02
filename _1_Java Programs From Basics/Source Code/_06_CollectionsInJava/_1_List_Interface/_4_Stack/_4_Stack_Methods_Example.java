package _06_CollectionsInJava._1_List_Interface._4_Stack;

import java.util.Stack;

/**
 @Important Methods
 push() - adds element to the stack
 set() - used to modify the element of the stack
 get() - used to get the element of the stack
 pop() - used to remove the element from the stack
 contains() - 	checks if the stack contains the element
 size() - checks the size of stack
 toArray() - used to convert stack to array
 toString() - used to convert stack to string
 clear() - used to clear the stack
 removeAll() - removes all the element of the stack
 removeAllElements() - removes all the element of the stack
 removeElementAt() - removes element at the specified index
 */

public class _4_Stack_Methods_Example
{
    public static void main(String[] args)
    {
        //creating a stack
        Stack<String> languages = new Stack<String>();

        //adding elements to stack
        //push()
        languages.push("Java");
        languages.push("Python");
        languages.push("C");
        languages.push("C++");
        languages.push("SQL");

        //get()
        System.out.println("After get(): "+languages.get(3));

        //set()
        languages.set(0,"JAVA");
        System.out.println("After set(): "+languages);

        //contains()
        System.out.println("After contains(): "+languages.contains("JAVA"));

        //size()
        System.out.println("After size(): "+languages.size());

        //toArray()
        String data[] = new String[languages.size()];
        languages.toArray(data);
        for(String languagesArray: languages)
        {
            System.out.println(languagesArray);
        }

        //toString()
        String datas = languages.toString();
        System.out.println("After toString(): "+datas);

        //pop()
        languages.pop();
        System.out.println("After using pop(): "+languages);

        //removeAll(), removeAllElements(), removeAllElementsAt()
        languages.removeElementAt(3);
        System.out.println("After removeAllElementsAt(): "+languages);
        languages.removeAllElements();
        System.out.println("After removeAllElements(): "+languages);
        languages.removeAll(languages);
        System.out.println("After removeAll(): "+languages);

        //clear()
        languages.clear();
        System.out.println("After clear(): "+languages);

    }
}
