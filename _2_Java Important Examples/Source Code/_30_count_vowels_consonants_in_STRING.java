public class _30_count_vowels_consonants_in_STRING
{
    public static void main(String[] args)
    {
        String str =  "This is a really simple sentence@".toLowerCase();

        int extraCount = 0;
        int vCount = 0;
        int cCount = 0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vCount++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                cCount++;
            }
            else
            {
                extraCount++;
            }
        }
        System.out.println("The string has vowels: "+vCount);
        System.out.println("The string has consonants: "+cCount);
        System.out.println("The string has extra symbols: "+extraCount);
    }
}
