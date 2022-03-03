public class _28_count_characters_in_STRING
{
    public static void main(String[] args)
    {
        String str = "The best of both worlds";
        int countChar =0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                countChar++;
            }
        }
        System.out.println("The total number of character in string: '"+str+"' is: "+countChar);
    }
}
