package _2_Algorithms._01_Sorting_Algorithms._03_Insertion_Sort;

import java.util.Arrays;
import java.util.LinkedList;

class insertionSortExample
{
    //algorithm
    static void sortInsertion(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            //we want key element and previous index to shift
            int keyElement = arr[i];
            int index = i-1;

            while(index >=0 && keyElement < arr[index])
            {
                //if condition is true shift the element of arr[index] to next position
                arr[index+1] = arr[index];

                //decrement index to swap
                index--;
            }

            arr[index+1] = keyElement;
        }
    }

    static void displaySorted(int arr[])
    {
        String sortedArray = Arrays.toString(arr);
        System.out.println("After Sorted Array is: "+sortedArray);
    }
}

public class _03_insertionSort_Algorithm_Example
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

        //converting linkedlist to array
        Object[] objectArray = data.toArray();
        int intArr[] = new int[data.size()];
        for(int i=0;i<data.size();i++)
        {
            intArr[i] = (int)objectArray[i];
        }

        //instantiation of utility class 'insertionSortExample'
        new insertionSortExample();
        insertionSortExample.sortInsertion(intArr);
        insertionSortExample.displaySorted(intArr);
    }
}
