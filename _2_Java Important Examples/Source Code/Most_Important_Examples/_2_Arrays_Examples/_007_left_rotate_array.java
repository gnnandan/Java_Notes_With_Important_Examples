package Most_Important_Examples._2_Arrays_Examples;

import java.util.Arrays;

public class _007_left_rotate_array
{
    public static void main(String[] args)
    {
        //declare array
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Before Rotation: "+ Arrays.toString(array));

        int times = 3; //number of times to rotate

        //loop to rotate number of times
        for(int i=0;i<times;i++)
        {
            //first firstElement
            int firstElement = array[0];

            //loop starts from beginning
            for(int j=0;j<array.length-1;j++)
            {
                //shift array one by one towards left
                array[j]= array[j+1];
            }

            //firstElement will be placed to last of array
            array[array.length-1] = firstElement;
        }
        System.out.println("After Rotation: "+Arrays.toString(array));
    }
}

//output
//Before Rotation: [1, 2, 3, 4, 5]
//After Rotation: [4, 5, 1, 2, 3]