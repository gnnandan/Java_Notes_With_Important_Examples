package Review;

public class _40_separate_individual_character_In_String
{
    public static void main(String[] args)
    {
        String string = "Big black bug bit a big black dog on his big black nose";
        char chars[] = string.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            System.out.print(chars[i]+" - ");
        }
    }
}
