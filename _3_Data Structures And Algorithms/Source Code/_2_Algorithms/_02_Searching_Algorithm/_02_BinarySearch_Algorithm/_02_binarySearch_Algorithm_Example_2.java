package _2_Algorithms._02_Searching_Algorithm._02_BinarySearch_Algorithm;

class binarySearchExample2
{
    static int searchBinary(int arr[], int ele)
    {
        int left=0;
        int right= arr.length-1;

        while(left<=right)
        {
            int mid = left +(right - left)/2;

            if(ele == arr[mid])
            {
                return mid;
            }
            else if(ele > arr[mid])
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

public class _02_binarySearch_Algorithm_Example_2
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50};
        int result = binarySearchExample1.searchBinary(arr,10);
        if(result ==-1)
        {
            System.out.println("Item not found");
        }
        else
        {
            System.out.println("Item found " + result);
        }
    }
}
