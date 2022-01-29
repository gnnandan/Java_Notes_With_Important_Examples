package _05_ArraysConcept;

import java.util.Scanner;

public class _6_checkingelementpresentinarray_Example
{
    public static void main(String[] args)
    {
        int number [] = {1,2,3,4,5,6,7,8,9,10};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number that you want to find in an array: ");
        int findNum = scanner.nextInt();

        boolean flag = false;
        for(int elements: number)
        {
            if(findNum == elements)
            {
                flag = true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("The element "+findNum+" present in array");
        }
        else
        {
            System.out.println("The element "+findNum+" not present in array");
        }
    }
}
