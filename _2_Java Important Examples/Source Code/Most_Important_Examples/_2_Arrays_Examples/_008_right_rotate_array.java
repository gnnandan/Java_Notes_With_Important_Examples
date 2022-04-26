package Most_Important_Examples._2_Arrays_Examples;

import java.util.Arrays;

public class _008_right_rotate_array
{
    public static void main(String[] args)
    {
        //declare array
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Before Rotation: "+ Arrays.toString(array));
        int rightRotation = 3;

        for(int i=0;i<rightRotation;i++)
        {

            int lastElement = array[array.length-1]; //last element of an array

            //loop starts last element of array
            for(int j=array.length-1;j>0;j--)
            {
                //shifts array one by one towards right
                array[j] = array[j-1];
            }
            array[0]= lastElement; //last element will be added to start of array
        }
        System.out.println("After Right Rotation: "+Arrays.toString(array));
    }
}

//output
//Before Rotation: [1, 2, 3, 4, 5]
//After Right Rotation: [3, 4, 5, 1, 2]