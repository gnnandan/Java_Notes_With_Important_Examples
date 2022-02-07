package _2_Algorithms._02_Searching_Algorithm._01_LinearSearch_Algorithm;

public class _1_Linear_Search_Algorithm_Simple_Example
{
    public static void main(String[] args)
    {
        int arr[] = {10,40,50,21,45,0,12,200};
        int target = 12;
        int answer = linearSearch(arr,target);
        System.out.println("The element found: "+answer);
    }

    static int linearSearch(int arr[], int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        else
        {
            for(int index=0;index< arr.length;index++)
            {
                if(arr[index]==target)
                {
                    return index;
                }
            }
            // if no element found so return -1
            return -1;
        }
    }
}
