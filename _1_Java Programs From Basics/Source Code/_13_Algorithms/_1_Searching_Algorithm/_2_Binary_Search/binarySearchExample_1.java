package _13_Algorithms._1_Searching_Algorithm._2_Binary_Search;

import java.util.Arrays;

public class binarySearchExample_1
{
    public static void main(String[] args)
    {
        int arr[] = {10, 60, 63, 12, 53, 56, 100};

        Arrays.sort(arr);//to do binary search array must be sorted

        int result = searchBinary(arr,60);
        if(result==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("The element found at position: "+result);
        }
    }

    static int searchBinary(int arr[], int find)
    {
        int mid;
        int low =0;
        int high = arr.length-1;

        while(low<=high)
        {
            mid = (low+high)/2;

            if(arr[mid]==find)
            {
                return mid;
            }
            else if (arr[mid]>find)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }
}
