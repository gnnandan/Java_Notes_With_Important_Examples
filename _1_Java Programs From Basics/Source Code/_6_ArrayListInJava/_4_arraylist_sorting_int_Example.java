package _6_ArrayListInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _4_arraylist_sorting_int_Example
{
    public static void main(String[] args)
    {
        ArrayList<Integer> number = new ArrayList<Integer>(5);
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the random numbers for sorting: ");
            int j = scanner.nextInt();
            number.add(j);
        }

        System.out.println();

        System.out.println("The arraylist before sorting: "+number);

        System.out.println();


        Collections.sort(number); //sorting technique
        System.out.print("The arraylist after sorting: ");
        for(int k: number)
        {
            System.out.print(k+" ");
        }

    }
}
