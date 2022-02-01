package _2_Algorithms._01_Sorting_Algorithms._02_Selection_Sort;

import java.util.Arrays;

class selectionSorts
{
    static void SSsort(int sorted[])
    {
        int size = sorted.length;
        for(int i=0;i<size-1;i++)
        {
            int minElement = i;
            for(int j=i+1;j<size;j++)
            {
                //if current element is lessthan minimum element
                if(sorted[j]<sorted[minElement])
                {
                    minElement = j;
                }
            }
            int temp = sorted[i];
            sorted[i] = sorted[minElement];
            sorted[minElement] = temp;
        }
    }
}

public class _2_selectionSort_Example
{
    public static void main(String[] args)
    {
        int unSorted[] = {100,-200,-123,-1,232,0,1,2,100,234,12};

        selectionSorts.SSsort(unSorted);
        String sortedOrder = Arrays.toString(unSorted);
        System.out.println("Sorted Order: "+sortedOrder);
    }
}
