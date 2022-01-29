package _10_iteratorInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class _2_iteratorImportant_Example
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(100);
        nums.add(12);
        nums.add(15);
        nums.add(20);
        nums.add(2);
        nums.add(3);
        nums.add(123);
        nums.add(1);
        nums.add(200);

        System.out.println("The ArrayList Elements are: "+nums);

        Iterator<Integer> iterator = nums.iterator();

        while(iterator.hasNext())
        {
            int i = iterator.next();
            if(i<=10)
            {
                iterator.remove();
            }
        }
        System.out.println("The remaining elements are: "+nums);

    }
}
