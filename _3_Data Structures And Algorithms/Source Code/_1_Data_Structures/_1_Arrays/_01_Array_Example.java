package _1_Data_Structures._1_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Array_Example
{
    public static void main(String[] args)
    {
        arrayExample();
        System.out.println("----------------------------");
        arrayInput();
    }

    static void  arrayExample()
    {
        System.out.println("Array example");

        //creating an array
        int[] data = {10,20,30,40,50,60,70};

        //accessing value
        System.out.println("Accessing the elements: "+data[3]);

        //modifying or updating value
        data[3]=100;
        System.out.println("After updating the elements: "+Arrays.toString(data));
    }

    static void arrayInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        //declaration and initialization;
        int arr[] = new int[size];

        System.out.println();

        for(int i=0;i< arr.length;i++)
        {
            //taking input
            System.out.print("Enter the elements one by one: ");
            int element = scanner.nextInt();
            arr[i] = element;
        }


        System.out.println("\nThe elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }

        //displaying an array
        System.out.println("New Way to display an array elements: "+ Arrays.toString(arr));
    }
}
