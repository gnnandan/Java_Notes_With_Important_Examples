package _2_Algorithms._01_Sorting_Algorithms._01_Bubble_Sort;

import java.util.ArrayList;
import java.util.Arrays;

class sort
{
    static void bSort(Integer data[])
    {
        int size = data.length;

        // loop to access each array element
        for(int i=0;i<size-1;i++)
        {
            // loop to compare adjacent elements
            for(int j=0;j<size-i-1;j++)
            {
                // compare two array elements
                // change > to < to sort in descending order
                if(data[j] > data[j+1])
                {
                    //swap
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}

public class _2_Bubble_Sort_Example
{
    public static void main(String[] args)
    {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(100);
        data.add(250);
        data.add(-10012);
        data.add(-2);
        data.add(-1);
        data.add(0);
        data.add(10);
        data.add(2);
        data.add(1);

        System.out.println("The unsorted arraylist is: "+data);

        Integer[] intData = new Integer[data.size()]; //converting Arraylist to array of 'type int'
        data.toArray(intData);

        sort.bSort(intData);

        String sorted = Arrays.toString(intData);
        System.out.println("The sorted arraylist is: "+sorted);
    }
}
