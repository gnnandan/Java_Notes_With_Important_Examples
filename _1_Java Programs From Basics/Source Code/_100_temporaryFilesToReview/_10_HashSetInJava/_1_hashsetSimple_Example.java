package _100_temporaryFilesToReview._10_HashSetInJava;

import java.util.HashSet;
public class _1_hashsetSimple_Example
{
    public static void main(String[] args)
    {
        //declaring and memory allocating the hashset
        HashSet<String> data = new HashSet<String>();

        //adding elements to the hashset
        data.add("TATA");
        data.add("Range Rover");
        data.add("Hyundai");
        data.add("Tesla");
        data.add("Mahindra");
        data.add("Ford");

        //displaying the record of hashmap
        System.out.println("Displaying the elements of hashset: "+data);

        //to remove the element
        System.out.println("remove(stringToRemove) method to remove particular string from the hashset: "+data.remove("Ford"));
        System.out.println("remove(index) method to remove particular string from the hashset: "+data.remove(3));

        //checking the size of hashset
        System.out.println("The size of hashset is: "+data.size());

        //looping through the hashset
        System.out.print("The elements are: ");
        for(String s: data)
        {
            System.out.print(s+" ");
        }
    }
}
