package _1_Data_Structures._2_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class _3_iteratingOverArrayList_Example
{
    public static void main(String[] args)
    {
        //      Creation Of ArrayList
        ArrayList<String> languages = new ArrayList<String>();

        //adding elements to arraylist
        languages.add("java");
        languages.add("python");
        languages.add("c#");
        languages.add("c++");
        languages.add("c");

        //way-1
        System.out.println("Iterating ArrayList Using 'foreach': ");
        for(String languageList: languages)
        {
            System.out.println(languageList);
        }

        System.out.println();

        // way-2 using iterator class
        System.out.println("Iterating ArrayList Using 'iterator' class: ");
        Iterator<String> data = languages.iterator();
        while(data.hasNext())
        {
            System.out.println(data.next());
        }
    }
}
