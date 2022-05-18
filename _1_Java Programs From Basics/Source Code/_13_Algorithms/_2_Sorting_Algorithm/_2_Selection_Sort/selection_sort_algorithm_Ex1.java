package _13_Algorithms._2_Sorting_Algorithm._2_Selection_Sort;

/*
NOTE -> Algorithm logic
- loop "step" from 0 to size-1
    - Consider the first element as "MINIMUM"
    - In next loop say "i = step + 1" to size of array
        - Compare the first "MINIMUM" element with second element, if second element is smaller then assign "SECOND ELEMENT AS MINIMUM"
        - In the same way Compare the "MINIMUM" element with third element, is third element is smaller then assign "THIRD ELEMENT AS MINIMUM"
        - THIS PROCESS CONTINUE TILL THE LAST ELEMENT OF ARRAY
    - After each iteration "MINIMUM IS PLACED AT FRONT" of unsorted array
    - for each iteration, indexing starts from first unsorted element, and above process continue till we get sorted array
 */

import java.util.Arrays;

public class selection_sort_algorithm_Ex1
{
    public static void main(String[] args)
    {
        int arr[] = {20, 12, 10, 15, 2};
        System.out.println("Unsorted Array: "+ Arrays.toString(arr));
        selectionSortEx1(arr);
    }

    static void selectionSortEx1(int arr[])
    {
        for(int step=0;step< arr.length-1;step++) //first loop and capture the minimum element
        {
            int min = step; //assigning first element is MINIMUM

            for(int i=step+1;i< arr.length;i++) //second loop to check any other minimum element
            {
                if(arr[i]<arr[min]) //if we found any minimum than the first minimum
                {
                    //assign that element as minimum
                    min = i;
                }
            }

            //do swap operation
            int temp = arr[step];
            arr[step] =arr[min];
            arr[min] = temp;
        }
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }
}
