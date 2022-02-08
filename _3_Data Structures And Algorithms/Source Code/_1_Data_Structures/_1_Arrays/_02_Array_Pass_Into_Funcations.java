package _1_Data_Structures._1_Arrays;

import java.util.Arrays;

public class _02_Array_Pass_Into_Funcations
{
    public static void main(String[] args)
    {
        //creating an array
        int arr[] = {10,20,30,50,40,50,60};

        System.out.println("Array before passing into function as arguments: "+Arrays.toString(arr));

        //passing array as argument to a function
        funcArray(arr);

        System.out.println("Array after passing intro function as arguments:"+Arrays.toString((arr)));

    }

    //function with array as parameter
    static void funcArray(int arr[])
    {

        arr[0]= 10000;
//        System.out.println("The elements of array are: "+Arrays.toString(arr));
    }
}
