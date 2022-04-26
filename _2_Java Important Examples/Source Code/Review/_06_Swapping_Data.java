package Review;

import java.util.Arrays;

public class _06_Swapping_Data
{
    public static void main(String[] args)
    {
        String num = "12345";

        //converting string to character
        char ch[] = num.toCharArray();

        //checking the conversion
//        for(int i=0;i<num.length();i++)
//        {
//            ch[i] = num.charAt(i);
//        }

        //logic to swap operation
        for(int i=0;i< ch.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }
        }
        System.out.println("After swapping: "+ Arrays.toString(ch));
    }
}
