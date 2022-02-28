import java.util.Arrays;

public class _24_reversing_array
{
    public static void main(String[] args)
    {
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("The normal order of array: "+Arrays.toString(arr));

        reverseArray(arr);
    }

    static void reverseArray(int arr[])
    {
        int start =0;
        int end = arr.length-1;
        while(start<end)
        {
            //swap logic
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.print("The reversed order of array is: "+Arrays.toString(arr));
    }
}
