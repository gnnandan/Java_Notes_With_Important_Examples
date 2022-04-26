package _08_Object_Oriented_Concepts._5_Interface;

//interface class 1
interface interface1
{
    public abstract void method1();
}

//inheritance of interface class
interface interface2 extends interface1
{
    public abstract void method2();
}

//implementation class
class implementingClass implements interface2
{
    //body to abstract method 1
    @Override
    public void method1()
    {
        System.out.println("This is method 1");
    }

    //body to abstract method 2
    @Override
    public void method2()
    {
        System.out.println("This is method 2");
    }
}

public class _2_interface_and_inheritance
{
    public static void main(String[] args)
    {
        implementingClass ref = new implementingClass();
        ref.method1();
        ref.method2();
    }
}

//output
//This is method 1
//This is method 2