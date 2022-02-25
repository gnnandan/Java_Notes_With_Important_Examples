package _09_CollectionsInJava._1_List_Type._2_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class _5_takingLinkedListInput_int_Example
{
    public static void main(String[] args)
    {
        LinkedList<Integer> inputData = new LinkedList<Integer>();

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<=3;i++)
        {
            System.out.print("Enter the number one by one to add into linkedlist: ");
            int a = scanner.nextInt();
            inputData.add(a);
        }
        System.out.println("The Linked List After Adding Input Data: "+inputData);
    }
}
