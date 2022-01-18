package Object_Oriented_Concepts._2_inheritance._5_Execution_Procedure_Static_NonStatic_Instance_Types;

class parentB
{
    static String bs = "Static Variable Of Parent Class";
    static
    {
        System.out.println(bs);
        System.out.println("---------------------------------------");
        System.out.println("First Static Block Of Parent Class");
    }
    {
        parentFunc1();
        System.out.println("Second Static Block Of Parent Class");
    }
    parentB()
    {
        System.out.println("User Defined Parent Class Constructor");
        System.out.println("***************************************");
    }
    void parentFunc1()
    {
        System.out.println("Parent Class Static Method");
    }
}
class childB extends parentB
{
    String bss = "Static Variable Of Child Class";
    {
        System.out.println(bss);
        System.out.println("---------------------------------------");
        System.out.println("First Static Block Of Child Class");
    }
    {
        childFunc1();
        System.out.println("Second Static Block Of Child Class");
    }
    childB()
    {
        System.out.println("User Defined Child Class Constructor");
    }
    void childFunc1()
    {
        System.out.println("Child Class Static Method");
    }
}

public class _2_staticMembersIn_Inheritance
{
    public static void main(String[] args)
    {
        childB cb = new childB();
    }
}
