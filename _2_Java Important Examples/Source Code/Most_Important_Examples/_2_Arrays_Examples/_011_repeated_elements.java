package Most_Important_Examples._2_Arrays_Examples;

import java.util.Arrays;

public class _011_repeated_elements
{
    public static void main(String[] args)
    {
        //declare array
        int[] array = {1, 2, 3, 4, 5, 2, 5, 6, 1, 4, 9, 9};
        int[] repeatedArray = new int[array.length];
        for(int i=0;i< array.length;i++)
        {
            for(int j=i+1;j< array.length;j++)
            {
                //condition to check for equality
                if(array[i]==array[j])
                {
                    repeatedArray[i] = array[j];
                }
            }
        }
        System.out.println("Repeated array: "+Arrays.toString(repeatedArray));

    }
}
//output
//Repeated array: [1, 2, 0, 4, 5, 0, 0, 0, 0, 0, 9, 0]