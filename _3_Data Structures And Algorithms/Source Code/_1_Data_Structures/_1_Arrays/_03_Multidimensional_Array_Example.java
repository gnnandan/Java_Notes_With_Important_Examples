package _1_Data_Structures._1_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Note
 *  - Arrays.toString(array) ----- it displays the 2-d array elements.
 *  - Arrays.deepToString(array) ----- it displays the multidimensional array elements.
 */
public class _03_Multidimensional_Array_Example
{
    public static void main(String[] args)
    {
        multiDimArrayExample();
        System.out.println("--------------------");
        multiDimArrayInput();
    }

    static void  multiDimArrayExample()
    {
        System.out.println("Array example");

        //creating an array
        int[][] data = {{10,20,30},{40,50,60},{70,80,90}};

        //accessing value
        System.out.println("Accessing the elements: "+data[1][0]);

        //modifying or updating value
        data[1][0]=100;
        System.out.println("After updating the elements: "+ Arrays.deepToString(data));
    }

    static void multiDimArrayInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row size of array: ");
        int rowSize = scanner.nextInt();


        System.out.print("Enter the column size of array: ");
        int colSize = scanner.nextInt();


        //declaration and initialization;
        int arr[][] = new int[rowSize][colSize];

        System.out.println();

        for(int row=0;row< arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                //taking input
                System.out.print("Enter the elements one by one: ");
                int element = scanner.nextInt();
                arr[row][col] = element;
            }
        }


        System.out.println("\nThe elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr[i].length;j++)
            {
                System.out.println(arr[i]+" "+arr[j]);
            }
        }

        //displaying an array
        System.out.println("New Way to display an array elements: "+ Arrays.deepToString(arr));
    }
}
