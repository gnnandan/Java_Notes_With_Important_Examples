package Object_Oriented_Concepts.inheritance._2_Types_Of_Inheritance;

class parentClass
{
    String s;
    void parentMethod()
    {
        s = "From Parent/Super Class";
        System.out.println(s);
        System.out.println("Ready To Inherit Properties(variable) and Behavior(functions) to 'Child Class'");
    }

}
class childClass extends parentClass
{
    String s;
    void childMethod()
    {
        s = "From Child Class";
        System.out.println(s);
        System.out.println("Inherited Properties(variable) and Behavior(functions) from parent class");
    }
}

public class singleLevel_Inheritance
{
    public static void main(String[] args)
    {
        System.out.println("Every Program starts to executes from 'Main Method'");
        System.out.println("Execution starts");
        System.out.println("------------------------------------");
        childClass cc = new childClass();
        cc.childMethod();
        System.out.println("------------------------------------");
        System.out.println("Execution ends");
    }
}
