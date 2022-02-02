package _2_Algorithms._01_Sorting_Algorithms;

//algorithm: Bubble Sort
class bubbleSort
{
    static void bb_sort(int arr[])
    {
        int size = arr.length;
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                //ascending order
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void display_bubble_SortedArray(int arr[])
    {
        int len = arr.length;
        System.out.print("The sorted array is using 'Bubble Sort': ");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

//algorithm: Insertion Sort
class insertionSort
{
    static void i_sort(int arr[])
    {
        int len = arr.length;
        for(int i=1;i<len;i++)
        {
            //variables to store element of sorted sublist and unsorted sublist
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key<arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    static void display_insertion_SortedArray(int arr[])
    {
        int len = arr.length;
        System.out.print("The sorted array is using 'Insertion Sort': ");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

//algorithm Selection Sort
class selectionSort
{
    static void s_sort(int arr[])
    {
        int size = arr.length;

        for(int i=0;i<size-1;i++)
        {
            int min =i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void display_selection_SortedArray(int arr[])
    {
        int len = arr.length;
        System.out.print("The sorted array is using 'Selection Sort': ");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class all_SortingAlgorithms_Example
{
    public static void main(String[] args)
    {
        int arr[] = {100,200,-123,-1,232,0,1,2};
        bubbleSort bb = new bubbleSort();
        bb.bb_sort(arr);
        bubbleSort.display_bubble_SortedArray(arr);

        insertionSort.i_sort(arr);
        insertionSort.display_insertion_SortedArray(arr);

        selectionSort.s_sort(arr);
        selectionSort.display_selection_SortedArray(arr);
    }
}
