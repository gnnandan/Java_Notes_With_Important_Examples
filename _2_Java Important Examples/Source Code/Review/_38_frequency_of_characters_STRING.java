package Review;

public class _38_frequency_of_characters_STRING
{
    public static void main(String[] args)
    {
        String str = "picture perfect";
        int frequency[] = new int[str.length()];
        char chars[] = str.toCharArray();

        for(int i=0;i< chars.length;i++)
        {
            frequency[i]=1;
            for(int j=i+1;j< chars.length;j++)
            {
                if(chars[i]==chars[j])
                {
                    frequency[i]++;

                    //replace with 0 after visiting
                    chars[j]='0';
                }
            }

            if(frequency[i]>1 && chars[i]!='0')
            {
                System.out.println(chars[i]+" :: "+frequency[i]);
            }
        }
    }
}
