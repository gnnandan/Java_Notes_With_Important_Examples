package Review;

public class _39_count_number_of_character_in_STRING
{
    public static void main(String[] args)
    {
        String string = "Big black bug bit a big black dog on his big black nose";

        int count=0;

        char chars[] = string.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            count++;
            System.out.print(chars[i]+" ");
        }

        System.out.println("\nThe total number of characters: "+count);
    }
}
