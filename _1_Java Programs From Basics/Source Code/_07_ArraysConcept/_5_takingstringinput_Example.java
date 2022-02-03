package _07_ArraysConcept;

import java.util.Scanner;

public class _5_takingstringinput_Example
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String data[] = new String[2];

        //for loop to take string input
        for(int i=0;i<= data.length-1;i++)
        {
            System.out.print("Enter the string one by one: ");
            data[i] = scanner.next();

        }

        System.out.println();

        //for loop to display the input string
        System.out.print("The resultant string after taking input is: ");
        for(int j=0;j< data.length;j++)
        {
            System.out.print(data[j]+" ");
        }

    }
}
