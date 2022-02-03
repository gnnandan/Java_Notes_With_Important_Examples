package _100_temporaryFilesToReview._08_ArrayListInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _5_arraylist_sorting_string_Example
{
    public static void main(String[] args)
    {
        ArrayList<String> data = new ArrayList<String>(5);
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the random strings for sorting: ");
            String j = scanner.next();
            data.add(j);
        }

        System.out.println();

        System.out.println("The arraylist before sorting: "+data);

        System.out.println();


        Collections.sort(data); //sorting technique
        System.out.print("The arraylist after sorting: ");
        for(String k: data)
        {
            System.out.print(k+" ");
        }
    }
}
