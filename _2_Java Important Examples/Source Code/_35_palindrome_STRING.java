public class _35_palindrome_STRING
{
    public static void main(String[] args)
    {
        String str = "Madam".toLowerCase();

        //iterating string from the end
        String revStr = "";
        for(int i=str.length();i>=0;i--)
        {
            revStr = str.concat(revStr);
        }

        //if the string is equal to reverse of that string print palindrome or else not palindrome
        if(str.equals(revStr))
        {
            System.out.println("Both strings are palindrome..!");
        }
        else
        {
            System.out.println("Both strings are palindrome..!");
        }
    }
}
