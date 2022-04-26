package _08_Object_Oriented_Concepts.this_and_super;

class parentClass
{
    parentClass()
    {
        System.out.println("Non PARAMETERIZED Constructor: Parent Class Constructor - 1");
    }

    parentClass(String s)
    {
        this();//used to call the constructor of same class
        System.out.println("PARAMETERIZED Constructor: Parent Class Constructor - 2");
    }
}

class childClass extends parentClass
{
    childClass()
    {
        super("STRING"); //used to call the constructor of parent class
        System.out.println("Non PARAMETERIZED Constructor: Child Class Constructor - 1");
    }
}

public class super_method
{
    public static void main(String[] args)
    {
        System.out.println("Main Method");
        new childClass();
    }
}

//output
//Main Method
//Non PARAMETERIZED Constructor: Parent Class Constructor - 1
//PARAMETERIZED Constructor: Parent Class Constructor - 2
//Non PARAMETERIZED Constructor: Child Class Constructor - 1