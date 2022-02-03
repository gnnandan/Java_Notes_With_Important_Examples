package _2_Algorithms._02_Searching_Algorithm._01_LinearSearch_Algorithm;

import java.util.Scanner;

class linearSearchString
{
    static int searchChar(char arr[],char item)
    {
        int size = arr.length;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==item)
            {
                return i;
            }
        }
        return -1;
    }
}

public class _3_linearSearch_Algorithm_String_Example
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        //taking string value
        System.out.print("Enter the string to find the character position: ");
        String name = scanner.next().toLowerCase();

        //creating array of char and storing the string into separate characters
        char arr[] = new char[name.length()];
        for(int i=0;i<name.length();i++)
        {
            //System.out.println(name.charAt(i));
            arr[i] = name.charAt(i);
        }


        System.out.print("Enter the character to find: ");
        char item  =scanner.next().charAt(0);
        int result = linearSearchString.searchChar(arr,item);
        if(result!=-1)
        {
            System.out.println("Character: "+item+" fond at position: "+result);
        }
        else
        {
            System.out.println("Character: "+item+" not fond at position: "+result);
        }
    }
}
