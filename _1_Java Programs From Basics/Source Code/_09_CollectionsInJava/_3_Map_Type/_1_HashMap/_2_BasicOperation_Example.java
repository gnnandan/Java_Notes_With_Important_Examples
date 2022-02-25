package _09_CollectionsInJava._3_Map_Type._1_HashMap;

import java.util.HashMap;

/**
 * @Note
 *  - adding element - put()
 *  - accessing element - get(keyData)
 *  - modify element - replace(keyData, replacingData)
 *  - remove element - remove(keyData)
 */

public class _2_BasicOperation_Example
{
    public static void main(String[] args)
    {
        // Create a HashMap object called data
        HashMap<Integer, String> data = new HashMap<>();

        //add keys, and values to the hashmap
        data.put(1,"Java");
        data.put(2,"Python");
        data.put(3,"C++");
        data.put(4,"C");
        data.put(5,"Swift");
        System.out.println("The hashmap data: "+data);

        //accessing the hashmap data
        System.out.println("Accessing the elements using keys: "+data.get(1));

        //modifying the hashmap data
        System.out.println("modifying the elements using keys: "+data.replace(1,"JAVA"));
        System.out.println("After Modifying: "+data);

        //removing the hashmap data
        System.out.println("removing the elements using keys: "+data.remove(5));
        System.out.println("After removing element: "+data);


        //final elements of hashmap
        System.out.println("The final elements of hashmap: "+data);
    }
}
