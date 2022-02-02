package _2_Algorithms._01_Sorting_Algorithms._03_Insertion_Sort;

class sorting
{
    //algorithm
    static void sortingInsertion_2(int arr[])
    {
        int size = arr.length;
        for(int i=1;i<size;i++)
        {
            int key = arr[i];
            int j = i-1;


            while(j>=0 && key < arr[j])
            {
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }
    static void displaySorted(int arr[])
    {
        int len = arr.length;
        System.out.print("The sorted array is: ");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class _02_insertionSort_Example
{
    public static void main(String[] args)
    {
        int arr[] = {100,-10,1,2,210,-4,2,5};

        System.out.println("Execution Started ");
        sorting.sortingInsertion_2(arr);
        sorting.displaySorted(arr);
        System.out.println("Execution Ended");
    }
}
