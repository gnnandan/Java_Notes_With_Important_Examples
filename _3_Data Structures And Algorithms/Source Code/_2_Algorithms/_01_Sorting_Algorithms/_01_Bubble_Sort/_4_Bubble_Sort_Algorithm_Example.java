package _2_Algorithms._01_Sorting_Algorithms._01_Bubble_Sort;

import java.util.LinkedList;

class linkedListBubbleSort
{
    public static void sort(int[] data)
    {
        int size = data.length;

        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(data[j]> data[j+1])
                {
                    //variables
                    int store1 = data[j];
                    int store2 = data[j+1];

                    //swap
                    int temp = data[j];
                    data[j] =data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
    public static void sortedOrder(int data[])
    {
        System.out.print("The sorted list is: ");
        for(int s: data)
        {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}

public class _4_Bubble_Sort_Algorithm_Example
{
    public static void main(String[] args)
    {
        LinkedList<Integer> data = new LinkedList<Integer>();
        data.add(10);
        data.add(1);
        data.add(120);
        data.add(-110);
        data.add(210);
        data.add(-140);
        data.add(1);
        data.add(4);
        data.add(-1);
        data.add(2);
        data.add(0);
        data.add(1);
        data.add(2);

        System.out.println("Linked List Elements: "+data);

        //conversion of linkedlist to array
        Object[] objArr = data.toArray();

        int len = objArr.length;

        int[] arr = new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i] = (int)objArr[i];
        }

        //creating instance for the class
        new linkedListBubbleSort();

        //calling static methods
        linkedListBubbleSort.sort(arr);
        linkedListBubbleSort.sortedOrder(arr);
    }
}
