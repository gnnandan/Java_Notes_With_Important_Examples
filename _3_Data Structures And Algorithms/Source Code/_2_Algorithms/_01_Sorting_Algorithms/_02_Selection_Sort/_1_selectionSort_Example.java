package _2_Algorithms._01_Sorting_Algorithms._02_Selection_Sort;

import java.util.Arrays;

class selectionSort
{
    static void sort(int arr[])
    {
        int size = arr.length;

        for(int i=0;i<size-1;i++)
        {
            //set the current element is minimum(currentMinimum)
            int min = i;

            //start comparison of elements from the first min element
            for(int j=i+1;j<size;j++)
            {
                //if the currentMinimum is greater than the looping element then set that element as minimum
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            //swapping process
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }
}

public class _1_selectionSort_Example
{
    public static void main(String[] args)
    {
        int unSorted[] = {100,200,-123,-1,232,0,1,2};
        selectionSort.sort(unSorted);

        String sorted = Arrays.toString(unSorted);
        System.out.println("'Selection Sort' The sorted element are: "+sorted);
    }
}
