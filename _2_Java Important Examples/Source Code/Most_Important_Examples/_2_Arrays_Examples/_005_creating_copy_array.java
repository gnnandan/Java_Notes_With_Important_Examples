package Most_Important_Examples._2_Arrays_Examples;

import java.util.Arrays;

public class _005_creating_copy_array
{
    public static void main(String[] args)
    {
        //declare array
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("The original array: "+Arrays.toString(array));

        //declare duplicate array with the size of original array
        int[] copyArray = new int[array.length];

        for(int i =0;i< array.length;i++)
        {
            //add iterated array to copyArray
            copyArray[i] = array[i];
        }

        //display copyArray
        System.out.println("The copy array: "+Arrays.toString(copyArray));
    }
}
//output
//The original array: [1, 2, 3, 4, 5]
//The copy array: [1, 2, 3, 4, 5]
