package _12_Data_Structures_In_Java.OOPS_DS_Implementation;

import java.util.Scanner;

class searching
{
    private static String[] arr;
    static Scanner scanner = new Scanner(System.in);
    static class linearSearch
    {
        public static int linearSearchAlgorithm(String arr[], String find)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i].compareTo(find)==0)
                {
                    return i;
                }
            }
            return -1;
        }

        public static void driveMethod(String arr[])
        {
            System.out.print("LINEAR SEARCH: Enter the name to find: ");
            String name = scanner.next();
            int found = linearSearchAlgorithm(arr,name);
            //System.out.println(found);
            if(found==-1)
            {
                System.out.println("The name "+name+" not found");
            }
            else
            {
                System.out.println("The name "+name+" found at position: "+found);
            }
        }
    }

}

class binarySearch
{
    private static String[] arr;
    static Scanner scanner = new Scanner(System.in);
    public static int binarySearchAlgorithm(String arr[], String find)
    {
        int mid;
        int low=0;
        int high = arr.length-1;

        while(low<=high)
        {

            mid = low + (high-low)/2;
            int res = arr[mid].compareTo(find);
            if(res==0)
            {
                return mid;
            }
            else if(res>0)
            {
                low = mid +1;
            }
            else
            {
                high = mid -1;
            }
        }
        return -1;
    }
}
public class Searching_Algorithms
{
    public static void main(String[] args)
    {
        String arr[] = {"Nandan", "Yashas", "Ganesh", "Anand", "Pavan","Suhas"};
        //searching.linearSearch.driveMethod(arr);

        System.out.println(binarySearch.binarySearchAlgorithm(arr, "Nandan"));
    }
}

//TODO-> binarysearch is having