package _09_Collections_In_Java._1_List_Type._3_Vector;

import java.util.Scanner;
import java.util.Vector;

public class _6_taking_Vector_Input_string_Example
{
    public static void main(String[] args)
    {
        Vector<String> data = new Vector<String>();
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<=3;i++)
        {
            System.out.print("Enter the String one by one to add into vector: ");
            String a = scanner.next(); //Note the step
            data.add(a);
        }

        System.out.println("Final vector data: "+data);
    }
}
