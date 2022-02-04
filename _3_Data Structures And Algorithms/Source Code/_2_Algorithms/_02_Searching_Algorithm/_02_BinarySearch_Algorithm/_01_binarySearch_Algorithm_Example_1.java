package _2_Algorithms._02_Searching_Algorithm._02_BinarySearch_Algorithm;


class binarySearchExample1
{
    static int searchBinary(int arr[], int item)
    {
        int low = 0;
        int high = arr.length-1;

        while(low<=high)
        {
            int mid = low + (high - low)/2;

            /**
             * Note: There are 3 cases
             * 1. item ==arr[mid]
             *      return arr[mid]
             * 2. item < arr[mid]
             *      low is mid-1
             * 3. item > arr[mid]
             *      high is mid-1
             */
            if(item == arr[mid])
            {
                return mid;
            }
            else if(item > arr[mid])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }
}

public class _01_binarySearch_Algorithm_Example_1
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50};
        int result = binarySearchExample1.searchBinary(arr,50);
        if(result ==-1)
        {
            System.out.println("Item not found");
        }
        else
        {
            System.out.println("Item found "+result);
        }
    }
}
