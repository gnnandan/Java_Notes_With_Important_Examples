package _13_Algorithms._1_Searching_Algorithm._1_Linear_Search;

import java.util.Scanner;

public class linearSearchExample_1
{
    public static void main(String[] args)
    {
        int arr[] = {10, 60, 63, 12, 53, 56, 100};
        int foundPosition = searchLinear(arr,60);

        if(foundPosition==-1)
        {
            System.out.println("The element not found at any position: "+foundPosition);
        }
        else
        {
            System.out.println("The element found at position: "+foundPosition);
        }
    }


    //logic of the code
    static int searchLinear(int arr[], int find)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i] == find)
            {
                return i;
            }
        }
        return -1;
    }
}
