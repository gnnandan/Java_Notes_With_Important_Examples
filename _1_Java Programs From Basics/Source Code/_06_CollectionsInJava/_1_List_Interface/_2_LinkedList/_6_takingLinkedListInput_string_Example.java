package _06_CollectionsInJava._1_List_Interface._2_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class _6_takingLinkedListInput_string_Example
{
    public static void main(String[] args)
    {
        LinkedList<String> inputData = new LinkedList<String>();

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<=3;i++)
        {
            System.out.print("Enter the string one by one to add into linkedlist: ");
            String a = scanner.next();
            inputData.add(a);
        }
        System.out.println("The Linked List After Adding Input Data: "+inputData);
    }
}
