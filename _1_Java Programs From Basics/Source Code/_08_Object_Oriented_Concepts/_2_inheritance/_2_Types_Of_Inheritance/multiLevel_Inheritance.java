package _08_Object_Oriented_Concepts._2_inheritance._2_Types_Of_Inheritance;

class A //parent class 1
{
    void func1()
    {
        System.out.println("Parent 1");
    }
}
class B extends A //parent class 2
{
    void func2()
    {
        System.out.println("Parent 2");
    }
}
class C extends B //child class
{
    void func3()
    {
        System.out.println("Multilevel Inheritance: Child");
    }
}


public class multiLevel_Inheritance
{
    public static void main(String[] args)
    {
        C c = new C();
        c.func1();
        c.func2();
        c.func3();
    }
}
