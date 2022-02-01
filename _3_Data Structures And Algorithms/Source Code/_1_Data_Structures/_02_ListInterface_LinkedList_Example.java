package _1_Data_Structures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Important Operations
 * 1. Pushing element on the top of the linked list  -- push()
 * 2. Popping element from the top of the linked list --pop()
 * 3. Displaying element on the top of the linked list
 * 4. Searching element in the linked list
 */

//circular linked list
class linkedListExample
{
    Scanner scanner = new Scanner(System.in);
    int num;

    //1. Pushing element on the top of the linked list  -- push()
    public void addElement(LinkedList<Integer> lList)
    {
        System.out.print("Enter the length of Linked List: ");
        num = scanner.nextInt();
        for(int i=0;i<=num;i++)
        {
            System.out.print("Enter the element to add: ");
            int element = scanner.nextInt();
            lList.push(element);
        }
    }

    //2. Popping element from the top of the linked list
    public void removeElement(LinkedList<Integer> lList)
    {
        Scanner scanner = new Scanner(System.in);

        /**
         * @logic
         * 1  - choosing which element to remove
         * 2  - capturing the indexOf that element i.e removing element
         * 3  - using remove() method removing that element from the linked list
         */
        System.out.print("\nEnter the element to remove: ");
        int removeEle = scanner.nextInt(); //1


        int removingIndex = lList.indexOf(removeEle); //2

        lList.remove(removingIndex); //3

        System.out.print("The final elements after removing "+removeEle+": ");
        for(Integer finalData: lList)
        {
            System.out.print(finalData+" ");
        }
    }

    //3. Displaying element on the top of the linked list --peak()
    public void displayData(LinkedList<Integer> lList)
    {
        Iterator<Integer> data = lList.iterator();

        System.out.print("The elements in linked list are: ");
        while(data.hasNext())
        {
            System.out.print(data.next()+" ");
        }
    }


    //4. Searching element in the linked list
    public void searchElement(LinkedList<Integer> lList)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the element to find: ");
        int findingEle = scanner.nextInt();
        if(lList.contains(findingEle))
        {
            System.out.println("The element "+findingEle+" found at position "+lList.indexOf(findingEle));
        }
        else
        {
            System.out.println("The element "+findingEle+" Not found at position any position "+lList.indexOf(findingEle));
        }
    }
}

public class _02_ListInterface_LinkedList_Example
{
    public static void main(String[] args)
    {
        LinkedList<Integer> lList = new LinkedList<Integer>();

        linkedListExample linkedlist = new linkedListExample();
        linkedlist.addElement(lList);
        linkedlist.displayData(lList);
        linkedlist.searchElement(lList);
        linkedlist.removeElement(lList);
    }
}
