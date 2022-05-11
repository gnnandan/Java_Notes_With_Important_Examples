package _09_Collections_In_Java._3_Map_Type._1_HashMap;

import java.util.HashMap;

public class _1_HashMap_Example
{
    public static void main(String[] args)
    {
        // Create a HashMap object called data
        HashMap<Integer, String> data = new HashMap<>();

        //add keys, and values to the hashmap
        data.put(1,"Nandan");
        data.put(2,"Yashas");
        data.put(3,"Ganesh");
        data.put(4,"Pavan");

        System.out.println("The hashmap data: "+data);

    }
}
