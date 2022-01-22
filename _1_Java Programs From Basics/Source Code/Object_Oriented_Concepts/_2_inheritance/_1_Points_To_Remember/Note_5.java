package Object_Oriented_Concepts._2_inheritance._1_Points_To_Remember;

/**
 * @Note-5
 * Child class can call the instance method of parent class directly.
 */

class parentClass1
{
    void func1()
    {
        System.out.println("Inside parent class 1");
    }
}
class parentClass2 extends  parentClass1
{
    void func2()
    {
        System.out.println("Inside parent class 2");
    }
}

public class Note_5
{
    public static void main(String[] args)
    {
        //create a instance where ever extends is happening
        parentClass2 p2 = new parentClass2();
        System.out.println("Calling members(_4_Functions) from child class");
        p2.func1();
        p2.func2();
    }
}
