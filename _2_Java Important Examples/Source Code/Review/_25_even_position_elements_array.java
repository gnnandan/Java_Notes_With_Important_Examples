package Review;

import java.util.Arrays;

public class _25_even_position_elements_array
{
    public static void main(String[] args)
    {
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("The normal array: "+ Arrays.toString(arr));
        evenPositionElements(arr);
        oddPositionElements(arr);
        midPositionElements(arr);
    }

    static void evenPositionElements(int arr[])
    {
        System.out.print("The even position elements: ");
        for(int i=1;i<arr.length;i=i+2)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n----------------------");
    }

    static void oddPositionElements(int arr[])
    {
        System.out.print("The odd position elements: ");
        for(int i=0;i<arr.length;i=i+2)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n----------------------");
    }

    static void midPositionElements(int arr[])
    {
        System.out.print("The mid position elements: ");
        int left=0;
        int right = arr.length-1;
        int mid=left+(right-left)/2;
        System.out.print(arr[mid]+" ");
    }
}
