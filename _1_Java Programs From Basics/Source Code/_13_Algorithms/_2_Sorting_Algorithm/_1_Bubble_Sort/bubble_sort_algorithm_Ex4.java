package _13_Algorithms._2_Sorting_Algorithm._1_Bubble_Sort;

import java.util.Arrays;

public class bubble_sort_algorithm_Ex4
{
    public static void main(String[] args)
    {
        int arr[] = {200,100,0,-190,200,-1,20, 405,500};
        System.out.println("Unsorted Array: "+ Arrays.toString(arr));
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=0;j< arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }
}
