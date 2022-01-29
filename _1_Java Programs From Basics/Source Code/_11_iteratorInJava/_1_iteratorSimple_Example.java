package _11_iteratorInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class _1_iteratorSimple_Example
{
    public static void main(String[] args)
    {
        ArrayList<String> brand = new ArrayList<String>();

        //adding element
        brand.add("TATA");
        brand.add("Hyundai");
        brand.add("Mahindra");
        brand.add("Ford");
        brand.add("Tesla");

        Iterator<String> iterator = brand.iterator();

        //iterating over first element
        System.out.println("The first iteration completed and the element: "+iterator.next());

        //iterating over all element of arraylist
        System.out.print("Iterating over all element: ");
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }

    }
}
