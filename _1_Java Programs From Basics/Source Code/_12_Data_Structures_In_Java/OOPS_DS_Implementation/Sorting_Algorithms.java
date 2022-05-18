package _12_Data_Structures_In_Java.OOPS_DS_Implementation;

import java.util.Arrays;

class sorting
{
    private static String arr[];
    static class bubbleSort
    {
        public static void bubbleSortAlgorithm(String arr[])
        {
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=0;j< arr.length-i-1;j++)
                {
                    if(arr[j].compareToIgnoreCase(arr[j+1])>0)
                    {
                        String temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            System.out.println("Bubble Sort sorted Names: "+ Arrays.toString(arr));
        }
    }

    static class selectionSort
    {
        public static void selectionSortAlgorithm(String arr[])
        {
            for(int step =0; step< arr.length-1;step++)
            {
                int min = step;
                for(int i=step+1;i< arr.length;i++)
                {
                    if(arr[i].compareToIgnoreCase(arr[min])<0)
                    {
                        min = i;
                    }
                }
                String temp = arr[step];
                arr[step] = arr[min];
                arr[min] = temp;
            }
            System.out.println("Selection Sort sorted Names: "+Arrays.toString(arr));
        }
    }
}

public class Sorting_Algorithms
{
    public static void main(String[] args)
    {
        String arr[] = {"Nandan", "Yashas", "Ganesh", "Anand", "Pavan","Suhas"};
        sorting.bubbleSort.bubbleSortAlgorithm(arr);
        sorting.selectionSort.selectionSortAlgorithm(arr);
    }
}
