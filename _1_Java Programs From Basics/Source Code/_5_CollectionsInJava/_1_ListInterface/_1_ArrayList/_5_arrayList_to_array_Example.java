package _5_CollectionsInJava._1_ListInterface._1_ArrayList;

import java.util.ArrayList;

public class _5_arrayList_to_array_Example
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

        System.out.println("The arraylist elements are: "+languages);

        //converting arraylist to array
        String[] languageArray = new String[languages.size()];
        languages.toArray(languageArray);

        for(String item: languageArray)
        {
            System.out.println(item+" ");
        }
    }
}
