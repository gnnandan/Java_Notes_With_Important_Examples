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

    static class binarySearch
    {
        public static int binarySearchAlgorithm(String arr[], String find)
        {
            int low=0;
            int high = arr.length-1;
            int mid;
            while (low<=high)
            {
                mid = (low+high)/2;
                if(arr[mid].compareTo(find)>0)
                {
                    high = mid-1;
                }
                else if(arr[mid].compareTo(find)<0)
                {
                    low = mid+1;;
                }
                else
                {
                    return mid;
                }
            }
            return -1;
        }
        public static void driveMethod(String arr[])
        {
            System.out.print("BINARY SEARCH: Enter the name to find: ");
            String name = scanner.next();
            int found = binarySearchAlgorithm(arr,name);
            System.out.println(found);
//            if(found==-1)
//            {
//                System.out.println("The name "+name+" not found");
//            }
//            else
//            {
//                System.out.println("The name "+name+" found at position: "+found);
//            }
        }
    }
}
public class Searching_Algorithms
{
    public static void main(String[] args)
    {
        String arr[] = {"Nandan", "Yashas", "Ganesh", "Anand", "Pavan","Suhas"};
        //searching.linearSearch.driveMethod(arr);
        searching.binarySearch.driveMethod(arr);
    }
}
