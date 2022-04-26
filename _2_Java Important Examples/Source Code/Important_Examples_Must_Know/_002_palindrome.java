package Important_Examples_Must_Know;

public class _002_palindrome
{
    public static void main(String[] args)
    {
        String str = "Madam".toLowerCase();
        palindrome(str);//pass the argument of same type to the parameter
    }

    static void palindrome(String str)
    {
        String revStr="";//an empty string
        for(int i=str.length()-1;i>=0;i--)
        {
            revStr = revStr+str.charAt(i); //concatenate the characters of string
        }

        //check whether palindrome or not
        if(str.equals(revStr))
        {
            System.out.println("The string "+str+" is palindrome");
        }
        else
        {
            System.out.println("The string "+str+" is not palindrome");
        }
    }
}

//output
//The string madam is palindrome