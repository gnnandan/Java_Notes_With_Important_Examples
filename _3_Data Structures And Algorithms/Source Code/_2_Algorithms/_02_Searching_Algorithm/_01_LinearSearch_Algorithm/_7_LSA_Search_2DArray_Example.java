package _2_Algorithms._02_Searching_Algorithm._01_LinearSearch_Algorithm;

import java.util.Arrays;

public class _7_LSA_Search_2DArray_Example
{
    public static void main(String[] args)
    {
        int arr[][] = {{10,20,40},{100,30,40},{60,80,50}};
        int target = 100;
        System.out.println("The item found in position: "+Arrays.toString(Search2D(arr,target)));
        System.out.println("The maximum item in an array is: "+findingMaxElement(arr));
        System.out.println("The minimum item in an array is: "+findingMinElement(arr));

    }

    //finding an element in 2d array
    static int[] Search2D(int arr[][], int target)
    {
        for(int row=0;row< arr.length;row++)
        {
            for (int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    //to return the index of element with row, column format
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int findingMinElement(int arr[][])
    {
        int minElement = arr[0][0];
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0; j< arr[i].length;j++)
            {
                if(arr[i][j]<minElement)
                {
                    minElement = arr[i][j];
                }

            }
        }
        return minElement;
    }

    static int findingMaxElement(int arr[][])
    {
        int maxElement = arr[0][0];
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>maxElement)
                {
                    maxElement = arr[i][j];
                }
            }
        }
        return maxElement;
    }
}
