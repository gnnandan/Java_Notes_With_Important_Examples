package Most_Important_Examples._2_Arrays_Examples;

import java.util.ArrayList;
import java.util.Arrays;
public class _006_finding_duplicate_element_in_array
{
    public static void main(String[] args)
    {
        //declare array
        int[] array = {1, 2, 3, 4, 5, 3, 4, 5, 1, 10};

        System.out.println("The array elements: "+ Arrays.toString(array));

        //ArrayList is a type of data structure
        /*
            NOTE:
                Since array doesn't store elements dynamically and array size is fixed,
                so we use collection called ArrayList to store duplicate elements dynamically
                Just understand what is ArrayList we will cover this topic at later stage
         */
        ArrayList<Integer> duplicateElements = new ArrayList<Integer>();

        for(int i=0;i< array.length;i++)
        {
            for(int j=i+1;j< array.length;j++)
            {
                if(array[i] == array[j])
                {
                    duplicateElements.add(array[j]);

                    //if you don't want to use ArrayList, you can directly print the duplicate elements directly also
                    //System.out.print(array[j]+" ");
                }
            }
        }
        System.out.println("The duplicate elements: "+duplicateElements);
    }
}
//output
//The array elements: [1, 2, 3, 4, 5, 3, 4, 5, 1, 10]
//The duplicate elements: [1, 3, 4, 5]