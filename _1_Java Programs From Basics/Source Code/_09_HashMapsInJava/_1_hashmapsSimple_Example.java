package _09_HashMapsInJava;

import java.util.HashMap;

public class _1_hashmapsSimple_Example
{
    public static void main(String[] args)
    {
        //declaring and memory allocating the hashmap
        HashMap<Integer, String> record = new HashMap<Integer, String>();
        //------ KEY,VALUE-----------------// pairs

        //adding data to hashmap
        record.put(1,"Nandan");
        record.put(2,"Darshan");
        record.put(3,"Kunal");
        record.put(4,"Thejas");
        record.put(5,"Yashas");

        //displaying the record of hashmap
        System.out.println("Hash Map Data's are: "+record);

        //accessing the elements of hash map using key
        System.out.println("Accessing the elements using the keys: "+record.get(1));

        //removing an element
        record.remove(3);
        System.out.println("After removing 'key = 3': "+record);

        //replacing the element
        record.replace(1,"Nandan G N");
        System.out.println("After replacing the record: "+record);

        //cloning the element
        System.out.println("After cloning: "+record.clone());

        //getting only values
        System.out.println("Getting only values: "+record.values());

        //getting only keys
        System.out.println("Getting only keys: "+record.keySet());

        //looping through hashmaps-keys
        System.out.println("The keys are: ");
        for(int i: record.keySet())
        {
            System.out.println(i);
        }

        //looping through hashmaps-values
        System.out.println("The values are: ");
        for(String s: record.values())
        {
            System.out.println(s);
        }

        //clearing the hashmap
        record.clear();
        System.out.println("After clearing the hashmap: "+record);
    }
}
