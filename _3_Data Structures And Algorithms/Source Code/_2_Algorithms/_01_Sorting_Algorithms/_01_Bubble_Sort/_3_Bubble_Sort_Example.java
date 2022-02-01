package _2_Algorithms._01_Sorting_Algorithms._01_Bubble_Sort;

import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarEntry;

class sortString
{
    static void bbSort(char name[])
    {
        int size = name.length;

        for(int i=0;i<size-1;i++)
        {
            for(int j = 0; j<size-i-1;j++)
            {
                if(name[j] > name[j+1])
                {
                    char temp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = temp;
                }
            }
        }
    }
}

public class _3_Bubble_Sort_Example
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String name = scanner.next();
        name = name.toLowerCase();


        //converting string to char array
        char Form[] = new char[name.length()];
        //logic to iterate over string
        for(int i=0;i<name.length();i++)
        {
            //System.out.println(name.charAt(i));
            //appending the character to char array
            Form[i] = name.charAt(i);
        }

        System.out.println("Unsorted data: "+name);
        sortString.bbSort(Form);
        String sorted = Arrays.toString(Form);
        System.out.println("Sorted data: "+sorted);
    }
}
