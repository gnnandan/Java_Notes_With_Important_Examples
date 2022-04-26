package Review;

import java.util.Arrays;

public class _23_left_rotate_array
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5};
        int times = 3;

        System.out.println("Before shifting array: "+Arrays.toString(arr));

        leftShiftArray(arr,times);
    }

    //left shift array logic
    static void leftShiftArray(int arr[], int times)
    {
        for(int i=0;i<times;i++)
        {
            //store the first element
            int first = arr[0];

            //counter
            int j;

            //another loop to shift element one by one
            for(j=0;j< arr.length-1;j++)
            {
                arr[j] = arr[j+1];
            }

            //the last element becomes first element
            arr[j] = first;
        }

        System.out.println("After shifting "+times+" the array is: "+ Arrays.toString(arr));
    }
}
