package _09_Collections_In_Java._1_List_Type._1_ArrayList;

import java.util.ArrayList;

public class _6_arrayList_to_String_Example
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

        //converting arraylist to string
        String list = languages.toString();
        System.out.println(list);
    }
}
