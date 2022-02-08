package _3_More_Examples;

import java.util.Arrays;

public class _03_reversing_Array_Int
{
    public static void main(String[] args)
    {
        int arr[] = {-1, 2, 3, 4,1, 100};

        System.out.println("Before swapping: "+Arrays.toString(arr));
        reverseArray(arr,0,arr.length-1);
        System.out.println("After swapping: "+Arrays.toString(arr));
    }


    static void reverseArray(int[] arr, int indexStart, int indexEnd)
    {
        int start =0;
        int end = arr.length-1;

        while(start<end)
        {
            int temp = arr[indexStart];
            arr[indexStart] = arr[indexEnd];
            arr[indexEnd] = temp;

            start ++;
            end --;
        }
    }
}
