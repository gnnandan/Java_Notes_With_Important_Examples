package Review;

import java.util.Arrays;

public class _32_all_possible_subset_in_STRING
{
    public static void main(String[] args)
    {
        String str = "FUN";

        int len = str.length();
        int count =0;
        String arr[] = new String[len*(len+1)/2];


        for(int i=0;i<len;i++)
        {
            for(int j=i;j< len;j++)
            {
                //substring to add possible next character to the string array
                arr[count] = str.substring(i,j+1);
                count++;
            }
        }

        System.out.println("The possible substring of a string: "+str+" is: "+ Arrays.toString(arr));
    }
}
