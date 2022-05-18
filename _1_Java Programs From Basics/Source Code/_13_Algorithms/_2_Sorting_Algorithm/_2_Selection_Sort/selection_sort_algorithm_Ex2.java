package _13_Algorithms._2_Sorting_Algorithm._2_Selection_Sort;

import java.util.Arrays;

public class selection_sort_algorithm_Ex2
{
    public static void main(String[] args)
    {
        int arr[] = {-1,-100,200,0,123,-12,120,400,500,35,2,45,3,5};
        System.out.println("Unsorted array:"+ Arrays.toString(arr));

        for(int step=0;step<arr.length-1;step++)
        {
            int min = step;
            for(int i=step+1;i< arr.length;i++)
            {
                if(arr[i]<arr[min])
                {
                    min = i;
                }
            }

            int temp = arr[step];
            arr[step] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Selection sort sorted array:"+ Arrays.toString(arr));
    }
}
