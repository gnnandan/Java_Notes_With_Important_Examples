package Object_Oriented_Concepts._1_ClassAndObject;

import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.Scanner;

//class to print a to z characters
class printAZ
{
    char c;
    public void operation()
    {
        for(c= 'a';c<='z';c++)
        {
            System.out.print(c+" ");
        }
    }
}

// class to check the string is palindrome or not
class palindrome
{
    String data;
    public void palindromeOperation()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String data = scanner.next();
        String revdata = "";
        for(int i = data.length()-1;i>=0;i--)
        {
            revdata = revdata+data.charAt(i);
        }

        if(data.equals(revdata))
        {
            System.out.println("String "+data+" is palindrome");
        }
        else
        {
            System.out.println("String "+data+" is not palindrome");
        }

    }
}

// class to print the reverse of string
class reverseString
{
    String normalStr;
    public void reverseOperation()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String normalStr = scanner.next();

        String reverseStr = "";
        for(int i = normalStr.length()-1;i>=0;i--)
        {
            reverseStr = reverseStr+normalStr.charAt(i);
        }
        System.out.println("The normal string is: "+normalStr+" and the reverse string is: "+reverseStr);
    }
}

// class to print the multiplication table
class multiply
{
    int num;

    public void multiplyOperation()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = scanner.nextInt();

        for(int i = num; i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}


public class _1_simpleProgram_Example
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter which logic to perform " +
                "\n1: printing A - Z" +
                "\n2: checking palindrome" +
                "\n3: reversing the string" +
                "\n4: multiplication table" +
                "\nPlease give select your choice: ");
        int choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
                printAZ c = new printAZ();
                c.operation();
                break;
            case 2:
                palindrome pc = new palindrome();
                pc.palindromeOperation();
                break;
            case 3:
                reverseString rs = new reverseString();
                rs.reverseOperation();
                break;
            case 4:
                multiply mp = new multiply();
                mp.multiplyOperation();
                break;
            default:
                System.out.println("Invalid choice, Please choose from 1 to 4.....!");
        }
    }
}
