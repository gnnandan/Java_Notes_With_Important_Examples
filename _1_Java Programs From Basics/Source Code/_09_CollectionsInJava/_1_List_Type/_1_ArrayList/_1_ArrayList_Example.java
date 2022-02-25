package _09_CollectionsInJava._1_List_Type._1_ArrayList;

import java.util.ArrayList;

public class _1_ArrayList_Example
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

        //viewing the content
        System.out.println("ArrayList Elements: "+languages);

    }
}
