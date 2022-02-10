import java.util.Scanner;

public class _02_palindrome
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str  = scanner.next();
        str = str.toLowerCase();
        palindrome(str);
    }

    static void palindrome(String str)
    {
        String revStr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            revStr = revStr+str.charAt(i);
        }

        if(str.equals(revStr))
        {
            System.out.println("The string "+revStr+" is palindrome");
        }
        else
        {
            System.out.println("The string "+revStr+" is not palindrome");
        }
    }
}
