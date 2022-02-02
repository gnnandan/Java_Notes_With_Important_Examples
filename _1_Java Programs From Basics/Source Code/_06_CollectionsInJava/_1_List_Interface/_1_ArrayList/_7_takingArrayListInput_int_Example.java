package _06_CollectionsInJava._1_List_Interface._1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _7_takingArrayListInput_int_Example
{
    public static void main(String[] args)
    {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        //to take arraylist input
        for(int i = 0;i<=3;i++)
        {
            System.out.print("Enter the number one by one: ");
            i = scanner.nextInt();
            num.add(i);
        }

        System.out.println();

        //to display arraylist element
        System.out.println("Integer Input ArrayList: "+num);

        System.out.println();

        //iterating over arraylist of type int
        System.out.println("The numbers are: ");
        for(int nums:num)
        {
            System.out.println(nums);
        }

    }
}
