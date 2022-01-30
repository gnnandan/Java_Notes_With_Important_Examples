package _06_CollectionsInJava._1_ListInterface._3_Vector;

import java.util.Scanner;
import java.util.Vector;

public class _5_takingVector_Input_int_Example
{
    public static void main(String[] args)
    {
        Vector<Integer> num = new Vector<Integer>();
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<=3;i++)
        {
            System.out.print("Enter the number one by one to add into vector: ");
            int a = scanner.nextInt(); //Note the step
            num.add(a);
        }

        System.out.println("Final vector data: "+num);
    }
}
