package _2_Algorithms._02_Searching_Algorithm._01_LinearSearch_Algorithm.more_on_LSA;

import java.util.LinkedList;
import java.util.Scanner;

class linearSearchExample
{
    static void searchSequential(int arr[], int item)
    {
        int size = arr.length;
        int i=-1;
        for(i=0;i<size-1;i++)
        {
            if(arr[i]==item)
            {
                System.out.println("The item: "+item+" found and index is: "+i);
                break;
            }
            System.out.println("The item: "+item+" not found at any index: "+i);
        }
    }
}


public class _4_linearSearch_Algorithm_LinkedList_Example
{
    public static void main(String[] args)
    {
        LinkedList<Integer> data = new LinkedList<Integer>();
        data.add(10);
        data.add(1);
        data.add(120);
        data.add(-110);
        data.add(210);
        data.add(-140);
        data.add(1);
        data.add(4);
        data.add(-1);
        data.add(2);
        data.add(0);
        data.add(1);
        data.add(2);

        System.out.println("Before Sorting: "+data);


        Object[] objectArray = data.toArray();

        int[] intArray = new int[data.size()];
        for(int i=0;i< objectArray.length;i++)
        {
            intArray[i] = (int)objectArray[i];
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to find: ");
        int element  = scanner.nextInt();
        linearSearchExample.searchSequential(intArray,element);
    }
}
