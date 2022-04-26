package Review;

import java.util.Arrays;

public class _27_concat_arrays
{
    public static void main(String[] args)
    {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        way1(array1,array2);
        way2(array1,array2);

    }

    static void way1(int arr1[],int arr2[])
    {
        int a1Len = arr1.length;
        int a2Len = arr2.length;

        int[] res = new int[a1Len+a2Len];
        System.arraycopy(arr1,0,res,0,a1Len);
        System.arraycopy(arr2,0,res,a1Len,a2Len);

        System.out.println("Way-1, After concatenating: "+ Arrays.toString(res));
    }

    static void way2(int arr1[],int arr2[])
    {
        int res[]= new int[arr1.length+ arr2.length];

        int pos=0;
        for(int ele:arr1)
        {
            res[pos] = ele;
            pos++;
        }

        for(int ele:arr2)
        {
            res[pos] = ele;
            pos++;
        }
        System.out.println("Way-2, After concatenating: "+ Arrays.toString(res));
    }
}
