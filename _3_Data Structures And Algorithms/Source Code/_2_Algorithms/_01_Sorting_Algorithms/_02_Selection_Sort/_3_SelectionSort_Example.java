package _2_Algorithms._01_Sorting_Algorithms._02_Selection_Sort;

import java.util.Arrays;
import java.util.LinkedList;

class selectionSortExample
{
    static void selectionSorting(int arr[])
    {
        int size = arr.length;
        for(int i=0;i<size-1;i++)
        {
            int min = i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }

            //swap operation
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void displaySorted(int arr[])
    {
        String sorted = Arrays.toString(arr);
        System.out.println("After soring: "+sorted);
    }
}

public class _3_SelectionSort_Example
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

        selectionSortExample.selectionSorting(intArray);
        selectionSortExample.displaySorted(intArray);

    }
}
