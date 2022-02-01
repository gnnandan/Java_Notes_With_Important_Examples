package _1_Data_Structures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class arrayListExample
{
    Scanner scanner = new Scanner(System.in);

    int num;
    public void addElement(ArrayList<Integer> data)
    {
        System.out.print("Enter the number of elements: ");
        num = scanner.nextInt();
        for(int i=0;i<=num;i++)
        {
            System.out.print("Enter the element one by one: ");
            Integer addNum = scanner.nextInt();
            data.add(addNum);
        }
    }


    public void displayElement(ArrayList<Integer> data)
    {
        Iterator<Integer> display = data.iterator();
        System.out.print("The elements of array list are: ");
        while(display.hasNext())
        {
            System.out.print(display.next()+" ");
        }
        System.out.println();
    }

    public void searchElement(ArrayList<Integer> data)
    {
        System.out.print("\nEnter the element to find: ");
        int findEle = scanner.nextInt();

        if(data.contains(findEle))
        {
            System.out.println("The element "+findEle+" is present at position: "+data.indexOf(findEle));
        }
        else
        {
            System.out.println("The element "+findEle+" not found so position is "+data.indexOf(findEle) );
        }

    }

    public void removeElement(ArrayList<Integer> data)
    {
        System.out.print("\nEnter the element to remove: ");
        int removeEle = scanner.nextInt();
        int pos = data.indexOf(removeEle);
        int result = data.remove(pos);
        System.out.println("The element "+removeEle+" removed from position: "+pos);
        System.out.print("The final elements are: ");
        for(int value: data)
        {
            System.out.print(value+" ");
        }
        System.out.println();
    }
}

public class _03_ListInterface_ArrayList_Example
{
    public static void main(String[] args)
    {
        ArrayList<Integer> data = new ArrayList<Integer>();

        arrayListExample ele = new arrayListExample();
        ele.addElement(data);
        ele.searchElement(data);
        ele.displayElement(data);
        ele.removeElement(data);

    }
}
