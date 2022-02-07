package _2_Algorithms._02_Searching_Algorithm._01_LinearSearch_Algorithm.more_on_LSA;


import java.util.Scanner;

class linearSearchAlgorithm_1
{
    //linear search algorithm
    static int search(int arr[], int item)
    {
        int size = arr.length;

        for(int i=0;i<size;i++)
        {
            if(arr[i]==item)
            {
                return i;
            }
        }
        return -1;
    }
}


public class _2_linearSearch_Algorithm_Example
{
    public static void main(String[] args)
    {
        int arr[] = {100,20,1,3,4,6,8,12,13,57,12,14};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to find: ");
        int item = scanner.nextInt();

        int result = linearSearchAlgorithm_1.search(arr,item);
        if(result!=-1)
        {
            System.out.println("The item: "+item+" is traced in a position: "+result);
        }
        else
        {
            System.out.println("The item: "+item+" is traced in a position: "+result);
        }
    }
}
