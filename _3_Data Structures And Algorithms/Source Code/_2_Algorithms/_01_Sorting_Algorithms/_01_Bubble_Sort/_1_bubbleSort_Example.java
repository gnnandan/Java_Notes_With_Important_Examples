package _2_Algorithms._01_Sorting_Algorithms._01_Bubble_Sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Bubble Sort
 * 1. for all elements of a list till length - 1
 *  1.1.  if leftElement > rightElement
 *      1.1.1 swap (leftElement and rightElement)
 *
 * @Note
 *
 * @Time Complexity
 * Best  - O(n)
 * Average - O(n2)
 * Worst - O(n2)
 *
 * @Space Complexity
 * O(1)
 */

class bubbleSort
{
    static void bubbleSortTechnique(int arr[])
    {
        int arraySize = arr.length;

        boolean swapped = false;

        // looping through the element of array
        for(int i=0;i<arraySize-1;i++)
        {
            //System.out.println("Test: "+arr[i]);
            //looping for comparision
            for(int j=0;j<arraySize-i-1;j++)
            {
                //left element > right element then swap
                if(arr[i]>arr[j+1])
                {
                    //swapping logic
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}


public class _1_bubbleSort_Example
{
    public static void main(String[] args)
    {
        int unSorted[] = {100,200,-123,-1,232,0,1,2};

        bubbleSort.bubbleSortTechnique(unSorted);

        String sorted = Arrays.toString(unSorted);
        System.out.println("'Bubble Sort' The sorted elements are: "+sorted);

    }
}
