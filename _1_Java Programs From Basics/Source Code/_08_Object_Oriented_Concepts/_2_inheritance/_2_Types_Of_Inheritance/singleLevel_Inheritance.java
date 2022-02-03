package _08_Object_Oriented_Concepts._2_inheritance._2_Types_Of_Inheritance;

class parentClass
{
    String s;
    void parentMethod()
    {
        s = "From Parent/Super Class";
        System.out.println(s);
        System.out.println("Ready To Inherit Properties(variable) and Behavior(_04_Functions) to 'Child Class'");
    }

}
class childClass extends parentClass
{
    String s;
    void childMethod()
    {
        s = "From Child Class";
        System.out.println(s);
        System.out.println("Inherited Properties(variable) and Behavior(_04_Functions) from parent class");
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
