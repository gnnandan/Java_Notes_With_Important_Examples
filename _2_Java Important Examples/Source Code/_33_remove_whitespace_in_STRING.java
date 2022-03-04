public class _33_remove_whitespace_in_STRING
{
    public static void main(String[] args)
    {
        String str =  "This is a really simple sentence".toLowerCase();

        //way - 1
        if(str.contains(" "))
        {
            System.out.println(str.replace(" ",""));
        }

        //way - 2
        System.out.println(str.replaceAll("\\s",""));
    }
}
