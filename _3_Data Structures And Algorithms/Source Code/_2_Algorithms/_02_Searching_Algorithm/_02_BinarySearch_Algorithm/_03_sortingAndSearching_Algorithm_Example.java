package _2_Algorithms._02_Searching_Algorithm._02_BinarySearch_Algorithm;

import java.util.Scanner;

class sortingSearching
{
    //bubbleSort Algorithm
    static void bubbleSort(int arr[])
    {
        int size = arr.length;

        for(int i =0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static int binarySearch(int[] arr,int data)
    {
        int len = arr.length;
        System.out.print("The sorted array is: ");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nNow searching started");

        //binary search algorithm
        int left = 0;
        int right = arr.length-1;

        //while loop to keeps on repeat until the length of array
        while(left<=right)
        {
            int mid = left + (right-left)/2;

            //there are 3 cases

//        1. data = arr[mid] =====> return mid
            if(data == arr[mid])
            {
                return mid;
            }

//        2. data > arr[mid] =====> left = mid + 1
            else if(data > arr[mid])
            {
                left = mid + 1;
            }

//        3. data < arr[mid] =====> right = mid - 1
            else
            {
                right = mid - 1;
            }
        }

        //if not found return -1
        return - 1;
    }
}


public class _03_sortingAndSearching_Algorithm_Example
{
    public static void main(String[] args)
    {
        int arr[] = {100,200,-123,-1,232,0,1,2};
        sortingSearching.bubbleSort(arr);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to find: ");
        int element = scanner.nextInt();

        int result = sortingSearching.binarySearch(arr,element);

        if(result!=-1)
        {
            System.out.println("The element found: "+element);
        }
        else
        {
            System.out.println("The element: "+element+" not found");
        }
    }
}
