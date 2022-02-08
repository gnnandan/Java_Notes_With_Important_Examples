package _3_More_Examples;

public class _02_finding_Maximum_Minimum_Element_In_Array
{
    public static void main(String[] args)
    {
        System.out.println("Finding a maximum element...!");
        int arr[] = {-1, 2, 3, 4,1, 100};
        findMax(arr);

        System.out.println();
        System.out.println("Finding a minimum element...!");
        findMin(arr);
    }

    //machine to find maximum element
    static void findMax(int arr[])
    {
        int max=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("The maximum element in an array: "+max);
    }

    //machine to find minimum element
    static void findMin(int arr[])
    {
        int min=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("The maximum element in an array: "+min);
    }
}
