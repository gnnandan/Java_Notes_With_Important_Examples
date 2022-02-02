package _2_Algorithms._01_Sorting_Algorithms._03_Insertion_Sort;

import java.util.Arrays;

class insertionSortExample_1
{
    static void sortInsertion(int arrEle[])
    {
        int size = arrEle.length;
        for(int i=1;i<size;i++)
        {
            //take 2 variable to compare sorted sublist and unsorted sublist
            int key = arrEle[i];
            int j = i-1;

            //while loop to compare the values and to shift
            // key < arr[j] ascending order
            // key > arr[j] descending order
            while(j>=0 && key < arrEle[j])
            {
                arrEle[j+1] = arrEle[j];
                j=j-1;
            }

            arrEle[j+1] = key;
        }
    }
}

public class _01_insertionSort_Example
{
    public static void main(String[] args)
    {
        int data[] = {100,-10,1,2,210,-4,2,5};

        insertionSortExample_1.sortInsertion(data);

        String sortedData = Arrays.toString(data);
        System.out.println("The sorted array using 'insertion sort': "+sortedData);
    }
}
