package Review;

import java.util.Scanner;

public class _03_reversingTheString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str  = scanner.next();

        System.out.println("The reverse of string: "+str+" is:"+reverse(str));
    }

    static String reverse(String str)
    {
        String revstr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            revstr = revstr+str.charAt(i);
        }
        return revstr;
    }
}
