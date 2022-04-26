package Review;

import java.util.Arrays;
import java.util.Scanner;

public class _26_ascending_and_descending_arrange_array
{
    public static void main(String[] args)
    {
        int arr[] = {5, 2, 8, 7, 1};
        System.out.println("Unsorted array: "+Arrays.toString(arr));
        ascendingArray(arr);
        descendingArray(arr);

    }
    static void ascendingArray(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Ascending order of array: "+ Arrays.toString(arr));
    }
    static void descendingArray(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Descending order of array: "+ Arrays.toString(arr));
    }
}
