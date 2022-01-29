package _05_ArraysConcept;

import java.util.Scanner;

public class _4_takinginputarray_Example
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int [] marks = new int[5];
        for(int i = 0; i< marks.length;i++)
        {
            System.out.print("Enter the marks one by one: ");  //this for loop to take input from the user
            marks[i] = scanner.nextInt();
        }

        //sum of those marks
        int sum = 0;
        for(int j = 0; j<marks.length;j++)
        {
            sum = sum+ marks[j];                //this for loop to do sum operation
        }

        System.out.println();
        System.out.println("The sum of the marks is: "+sum);
    }
}
