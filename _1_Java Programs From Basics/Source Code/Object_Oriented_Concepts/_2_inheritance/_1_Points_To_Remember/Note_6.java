package Object_Oriented_Concepts._2_inheritance._1_Points_To_Remember;

/**
 * @Note-6
 * The child class can call the inherited static methods directly.
 */
class parentClass_1
{
    static void func_1()
    {
        System.out.println("Inside static method/function of 'parentClass_1' ");
    }
}
class childClass_1 extends  parentClass_1
{
    void func_11()
    {
        System.out.println("Inside user defined function of 'child class'");
    }
}

public class Note_6
{
    public static void main(String[] args)
    {
        childClass_1 p11 = new childClass_1();
        parentClass_1.func_1(); //calling static method/function of parent class using class name
        p11.func_1(); //calling user defined method/function of parent class using reference variable

        System.out.println();
        p11.func_11();
    }
}
