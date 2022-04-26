package _08_Object_Oriented_Concepts.this_and_super;

class this_methodEx
{
    this_methodEx()
    {
        System.out.println("Constructor 1");
    }

    this_methodEx(int a)
    {
        this(); //to call constructor (if no parameter)
        System.out.println("Constructor 2");
    }
    this_methodEx(String s)
    {
        this(10); //to call constructor (if parameter)
        System.out.println("s: "+s);
        System.out.println("Constructor 3");
    }
}

public class this_method
{
    public static void main(String[] args)
    {
        System.out.println("Main Method");
        new this_methodEx("Parameterized constructor");
    }
}

//output
//Main Method
//Constructor 1
//Constructor 2
//s: Parameterized constructor
//Constructor 3