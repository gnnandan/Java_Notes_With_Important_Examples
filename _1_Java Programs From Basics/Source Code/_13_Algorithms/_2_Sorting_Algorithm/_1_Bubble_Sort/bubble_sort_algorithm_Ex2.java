package _13_Algorithms._2_Sorting_Algorithm._1_Bubble_Sort;

import java.util.Arrays;

public class bubble_sort_algorithm_Ex2
{
    public static void main(String[] args)
    {
        //sorting characters
        char cArray[] = {'z','b', 'a', 'c', 'f', 'd', 'e', 'g', 'i', 'h', 'j', 'l','k', 'n', 'm','p', 'o', 'q', 'r', 's', 't', 'u', 'w', 'v', 'y', 'x'};
        bubbleSort_Ex2(cArray);
    }

    static void bubbleSort_Ex2(char arr[])
    {
        for(int c=0; c< arr.length-1;c++)
        {
            for(int cc=0;cc< arr.length-c-1;cc++)
            {
                if(arr[cc]>arr[cc+1])
                {
                    char temp = arr[cc];
                    arr[cc] = arr[cc+1];
                    arr[cc+1] = temp;
                }
            }
        }

        System.out.println("The sorted characters are: "+ Arrays.toString(arr));
    }
}
