package Review;

public class _29_count_punctuations_in_STRING
{
    public static void main(String[] args)
    {
        String str = "He said, 'The mailman loves you.' I heard it with my own ears.";

        int punchCount = 0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')
            {
                punchCount++;
            }
        }
        System.out.println("The total number of punctuations exists in the string is: "+punchCount);
    }
}
