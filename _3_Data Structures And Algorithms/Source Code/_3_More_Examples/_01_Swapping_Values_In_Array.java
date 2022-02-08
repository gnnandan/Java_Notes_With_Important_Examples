package _3_More_Examples;

import java.util.Arrays;

public class _01_Swapping_Values_In_Array
{
    public static void main(String[] args)
    {
        //swapping array elements
        int arr[] = {-1, 2, 3, 4,1, 100};

        System.out.println("Before swapping: "+ Arrays.toString(arr));

        swapArray(arr,0,5); //swapping index 0 and 5
        System.out.println("After swapping: "+ Arrays.toString(arr));

    }

    static void swapArray(int arr[], int index1, int index2)
    {
        //logic
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
