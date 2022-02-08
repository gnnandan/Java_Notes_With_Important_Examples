package _1_Data_Structures._2_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _8_takingArrayListInput_string_Example
{
    public static void main(String[] args)
    {
        ArrayList<String> data = new ArrayList<String>();
        Scanner scanner  = new Scanner(System.in);

        //to take input
        for(int i = 0;i<=3;i++)
        {
            System.out.print("Enter the string data one by one: ");
            String string = scanner.next();
            data.add(string);
        }

        System.out.println();

        //to display arraylist element
        System.out.println("The strings are: "+data);

        System.out.println();

        //iterating over arraylist of type int
        System.out.println("The strings are: ");
        for(String datas: data)
        {
            System.out.println(datas);
        }
    }
}
