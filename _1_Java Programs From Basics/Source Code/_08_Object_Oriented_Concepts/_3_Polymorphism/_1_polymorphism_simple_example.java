package _08_Object_Oriented_Concepts._3_Polymorphism;

class parentClass
{
    void func() //form 1
    {
        System.out.println("Inside Parent Class Method");
    }
}

class childClass_1 extends parentClass
{
    void func() //form 2 ---> overriding method
    {
        System.out.println("Inside Child Class - 1 Method");
    }
}

class childClass_2 extends parentClass
{
    void func() //form 3 ---> overriding method
    {
        System.out.println("Inside Child Class - 2 Method");
    }
}

public class _1_polymorphism_simple_example
{
    public static void main(String[] args)
    {
        //parent reference child object
        parentClass obj_1 = new childClass_1();
        parentClass obj_2 = new childClass_2();

        //accessing child class using parent class
        obj_1.func();
        obj_2.func();
    }
}
//output
//Inside Child Class - 1 Method
//Inside Child Class - 2 Method