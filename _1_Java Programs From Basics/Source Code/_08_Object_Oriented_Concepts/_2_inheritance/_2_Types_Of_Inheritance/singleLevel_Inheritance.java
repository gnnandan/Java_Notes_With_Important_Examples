package _08_Object_Oriented_Concepts._2_inheritance._2_Types_Of_Inheritance;

class parentClass //parent class
{
    void parentMethod()
    {
        System.out.println("Parent Class");
    }

}
class childClass extends parentClass // child class
{
    void childMethod()
    {
        System.out.println("Single Level Inheritance: Child Class");
    }
}

public class singleLevel_Inheritance
{
    public static void main(String[] args)
    {
        System.out.println("Every Program starts to executes from 'Main Method'");
        System.out.println("Execution starts");
        childClass cc = new childClass();
        cc.childMethod();
        System.out.println("Execution ends");
    }
}
