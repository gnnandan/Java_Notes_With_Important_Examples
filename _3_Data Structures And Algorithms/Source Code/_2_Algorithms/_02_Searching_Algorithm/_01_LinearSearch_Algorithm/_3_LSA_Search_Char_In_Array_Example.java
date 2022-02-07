package _2_Algorithms._02_Searching_Algorithm._01_LinearSearch_Algorithm;

import java.util.Arrays;

public class _3_LSA_Search_Char_In_Array_Example
{
    public static void main(String[] args)
    {
        String name ="Nandan".toLowerCase();

        char target = 'd';

        //converting string to char array
        name = Arrays.toString(name.toCharArray());
        System.out.println("The char array is: "+name);
        System.out.println(search(name,target));
    }

    static boolean search(String str, char target)
    {
        for(char ch: str.toCharArray())
        {
            if(ch==target)
            {
                return true;
            }
        }
        return false;
    }
}
