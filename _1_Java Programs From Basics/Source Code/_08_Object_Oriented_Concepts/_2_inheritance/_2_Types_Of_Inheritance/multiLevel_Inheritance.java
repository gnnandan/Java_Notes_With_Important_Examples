package _08_Object_Oriented_Concepts._2_inheritance._2_Types_Of_Inheritance;

class A
{
    void func1()
    {
        System.out.println("Parent 1");
        System.out.println("inside the fun1 method");
    }
}
class B extends A
{
    void func2()
    {
        System.out.println("Parent 2");
        System.out.println("inside the fun2 method");
    }
}
class C extends B
{
    void func3()
    {
        System.out.println("Child");
        System.out.println("inside the fun3 method");
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
