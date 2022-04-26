package Most_Important_Examples._2_Arrays_Examples;

import java.util.Arrays;

public class _010_ascending_and_descending_array
{
    public static void main(String[] args)
    {
        //declare array
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Before Reverse: "+ Arrays.toString(array));

        ascendingOrder(array);
        descendingOrder(array);
    }

    //method that is used to sort array into ascendingOrder
    static void ascendingOrder(int array[])
    {
        for(int i=0;i< array.length;i++)
        {
            for(int j=i+1;j< array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Ascending order array: "+Arrays.toString(array));
    }

    //method that is used to sort array into descendingOrder
    static void descendingOrder(int array[])
    {
        for(int i=0;i< array.length;i++)
        {
            for(int j=i+1;j< array.length;j++)
            {
                if(array[i]<array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("descending order array: "+Arrays.toString(array));
    }
}
//output
//Before Reverse: [1, 2, 3, 4, 5]
//Ascending order array: [1, 2, 3, 4, 5]
//Ascending order array: [5, 4, 3, 2, 1]