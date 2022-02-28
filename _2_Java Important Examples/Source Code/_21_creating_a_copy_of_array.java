import java.util.Arrays;

public class _21_creating_a_copy_of_array
{
    public static void main(String[] args)
    {
        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = new int[arr1.length];

        System.out.println("The original array: "+ Arrays.toString(arr1));

        for(int i=0;i< arr1.length;i++)
        {
            arr2[i] = arr1[i];
        }

        System.out.println("The copy of original array: "+ Arrays.toString(arr2));
    }
}
