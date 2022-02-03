package _100_temporaryFilesToReview._08_ArrayListInJava;

import java.util.ArrayList;

public class _2_iteratingArrayList_Example
{
    public static void main(String[] args)
    {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(100);
        number.add(89);
        number.add(76);
        number.add(77);
        number.add(88);
        number.add(76);
        number.add(65);

        //looping through arraylist --- "Using For Loop"
        System.out.println("Iterating arraylist elements using 'for loop'");
        for (int i= 0 ;i<number.size();i++)
        {
            System.out.println("ArrayList Elements are: "+number.get(i));
        }
        System.out.println();

        //looping through arraylist --- "Using For each Loop"
        System.out.println("Iterating arraylist elements using 'foreach loop'");
        for(int numbers: number)
        {
            System.out.println("ArrayList Elements are: "+numbers);
        }
    }
}
