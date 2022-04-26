package Most_Important_Examples._2_Arrays_Examples;

import java.util.Arrays;

public class _009_reverse_an_array
{
    public static void main(String[] args)
    {
        //declare array
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Before Reverse: "+ Arrays.toString(array));

        int start = 0; //the first position
        int end = array.length-1; //the last position

        //looping process
        while(start<end)
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++; //increment start
            end--; //decrement end
        }

        //display reverse array
        System.out.println("After Reverse: "+ Arrays.toString(array));
    }
}
//output
//Before Reverse: [1, 2, 3, 4, 5]
//After Reverse: [5, 4, 3, 2, 1]