package _13_Algorithms._2_Sorting_Algorithm._1_Bubble_Sort;
/*
bubble sort algorithm is just a sorting technique which sorts element from left to right
    * for ascending order *
    - if the left element is smaller than the right element
        - "KEEP AS IT"
    - if the right element is smaller than the left element "
        - SWAP IT"
    - follow this order until the element is sorted
 */

import java.util.Arrays;

public class bubble_sort_algorithm_Ex1
{
    public static void main(String[] args)
    {
        int arr[] = { -2, 45, 0, 11, -9 };
        bubbleSortEx1(arr);
    }

    static void bubbleSortEx1(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j =0;j< arr.length-i-1;j++) //important
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted order of an array is: "+ Arrays.toString(arr));
    }
}
