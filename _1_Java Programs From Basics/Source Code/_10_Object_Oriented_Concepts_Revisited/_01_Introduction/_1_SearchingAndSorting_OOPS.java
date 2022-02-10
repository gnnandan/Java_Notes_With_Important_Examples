package _10_Object_Oriented_Concepts_Revisited._01_Introduction;

import java.util.Arrays;
import java.util.Scanner;

//linear search algorithm TEMPLATE
class linearSearchAlgorithm
{
    void search(int arr[], int item)
    {
        int size = arr.length;
        for(int i=0;i< size;i++)
        {
            if(arr[i] == item)
            {
                System.out.println("[LINEAR SEARCH] The item found index: "+i);
            }
            else
            {
                continue;
            }
        }
    }
}

//bubble sort & binary search algorithm TEMPLATE
class sortSearchAlgorithm
{
    void bubbleSort(int arr[])
    {
        int size = arr.length;
        for(int i=0;i< size-1;i++) //complete array iteration
        {
            for(int j=0;j< size-i-1;j++) // complete array iteration to compare with each element
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //sorted array
        System.out.println("[BUBBLE SORT] The sorted array is: "+ Arrays.toString(arr));
    }

    //binary search algorithm
    int binarySearch(int arr[],int item)
    {
        //Since binary search algorithm needs a sorted array, so we use any a sorting algorithm at first
        //binary search algorithm
        int left = 0;
        int right = arr.length-1;

        //looping until element found
        while(left<=right)
        {
            int mid = left +(right-left)/2;
            if(item == arr[mid])
            {
                return mid;
            }
            else if(item > arr[mid])
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return -1;
    }
}

//insertion sort algorithm TEMPLATE
class insertionSortAlgorithm
{
    void insertionSort(int arr[])
    {
        int size = arr.length-1;
        for(int i=1;i<size;i++)
        {
            int key = arr[i];
            int compEle = i-1;
            while (key<=arr[compEle])
            {
                arr[compEle+1] = arr[compEle];
            }
            arr[compEle+1] = key;
        }

        System.out.println("[INSERTION SORT] The sorted array is: "+Arrays.toString((arr)));
    }
}

//selection sort algorithm TEMPLATE
class selectionSortAlgorithm
{
    void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            //initially i is the min
            int min = i;
            for(int j=i+1;j< arr.length;j++)
            {
                // while comparing the min element with entire array elements.
                //if you found the element which is less than the minimum element.
                //update that element as minimum element
                if(arr[j]<arr[min])
                {
                    //update minimum value
                    min = j;
                }
            }
            //do swap temp and i {arr[i], arr[min]}
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("[Selection Sort] The sorted array is: "+Arrays.toString(arr));
    }
}

public class _1_SearchingAndSorting_OOPS
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //creating instance for each algorithm template
        linearSearchAlgorithm lsa = new linearSearchAlgorithm(); //linearSearch
        sortSearchAlgorithm bsbb = new sortSearchAlgorithm(); //bubbleSort & binarySearch
        insertionSortAlgorithm isa = new insertionSortAlgorithm(); //insertionSort
        selectionSortAlgorithm ssa = new selectionSortAlgorithm(); //selectionSort


        //taking input to find that input element
        System.out.print("Enter the element that you need to find: ");
        int item = scanner.nextInt();

        //array to sort and search
        int arr[] = {100,-120,-123,1,23,45,4};

        //linear search
        lsa.search(arr,item);

        //bubble sort
        bsbb.bubbleSort(arr);

        //binary search
        int result = bsbb.binarySearch(arr,item);
        if(result != -1)
        {
            System.out.println("[BINARY SEARCH] The element found: "+result);
        }
        else
        {
            System.out.println("[BINARY SEARCH] The element not found: "+result);
        }

        //insertion sort
        isa.insertionSort(arr);

        //selection sort
        ssa.selectionSort(arr);
    }
}
