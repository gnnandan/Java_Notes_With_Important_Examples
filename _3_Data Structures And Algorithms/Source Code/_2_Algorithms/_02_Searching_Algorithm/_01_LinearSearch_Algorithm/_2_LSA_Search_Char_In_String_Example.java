package _2_Algorithms._02_Searching_Algorithm._01_LinearSearch_Algorithm;

public class _2_LSA_Search_Char_In_String_Example
{
    public static void main(String[] args)
    {
        String name = "Nandan";
        name=name.toLowerCase();
        char target = 'd';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            if(target==str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}

