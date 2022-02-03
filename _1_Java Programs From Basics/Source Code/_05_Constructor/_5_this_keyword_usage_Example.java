package _05_Constructor;

import java.util.Scanner;

class thisUsageExample
{
    private String name;
    private int id;

    thisUsageExample(String Name,int Id)
    {
        this.name = Name;
        this.id = Id;
    }
}

public class _5_this_keyword_usage_Example
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        int id;

        System.out.print("Enter your name: ");
        name = input.next();

        System.out.print("Enter your id: ");
        id= input.nextInt();

        new thisUsageExample(name,id);
        System.out.println("Name is: "+name);
        System.out.println("Id is: "+id);
    }
}
