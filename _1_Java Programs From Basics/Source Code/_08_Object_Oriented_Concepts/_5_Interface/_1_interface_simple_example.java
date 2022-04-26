package _08_Object_Oriented_Concepts._5_Interface;

//interface class
interface interfaceExample
{
    //100% abstract method
    public abstract void method1();
    public abstract void method2();

    //variables
    public static final String str = "This is variable of interface class";
}

//a class implementing the interface
class example implements interfaceExample
{
    //implementation to the abstract method of interface class
    @Override
    public void method1()
    {
        System.out.println("This is method 1");
    }

    @Override
    public void method2()
    {
        System.out.println("This is method 2");
    }

    public void accessVar()
    {
        System.out.println("Accessing the interface variables: "+ interfaceExample.str);
    }
}

//class with main method
public class _1_interface_simple_example
{
    public static void main(String[] args)
    {
        //creating object to the implementing class
        example ex = new example();

        //accessing the variable
        ex.accessVar();

        //accessing the methods
        ex.method1();
        ex.method2();
    }
}

//output
//Accessing the interface variables: This is variable of interface class
//This is method 1
//This is method 2