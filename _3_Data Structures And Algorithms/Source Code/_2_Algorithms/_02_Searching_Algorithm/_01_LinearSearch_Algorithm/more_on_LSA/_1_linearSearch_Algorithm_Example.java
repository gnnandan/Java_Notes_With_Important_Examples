package _2_Algorithms._02_Searching_Algorithm._01_LinearSearch_Algorithm.more_on_LSA;

public class _1_linearSearch_Algorithm_Example
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,40,50,23,2,4,6,7,8};
        int item = 23;
        int result = linearSearch(arr,item);
        if(result !=-1)
        {
            System.out.println("The item "+item+" found at index "+result);
        }
        else
        {
            System.out.println("The item "+item+" not found at any index "+result);
        }
    }

    public static int linearSearch(int arr[], int item)
    {
        int size = arr.length;
        for(int i=0;i<size;i++)
        {
            //System.out.println(arr[i]);
            if(arr[i] == item)
            {
                return i;
            }
        }
        return -1;
    }
}
