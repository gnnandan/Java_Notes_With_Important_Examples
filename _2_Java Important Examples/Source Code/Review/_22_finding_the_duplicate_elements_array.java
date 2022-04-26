package Review;

import java.util.Arrays;

public class _22_finding_the_duplicate_elements_array
{
    public static void main(String[] args)
    {
        int [] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1, 3, 5};

        System.out.print("The duplicate elements in array are: ");
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
