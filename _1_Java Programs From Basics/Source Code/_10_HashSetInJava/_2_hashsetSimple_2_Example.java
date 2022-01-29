package _10_HashSetInJava;

import java.util.HashSet;

public class _2_hashsetSimple_2_Example
{
    public static void main(String[] args)
    {
        HashSet<Integer> number = new HashSet<Integer>();
        number.add(10);
        number.add(2);
        number.add(4);
        number.add(7);
        number.add(8);

        for(int i=0;i<=10;i++)
        {
            if(number.contains(i))
            {
                System.out.println(i+" is presented in hashset");
            }
            else
            {
                System.out.println(i+" is not presented in hashset");
            }
        }

    }
}
