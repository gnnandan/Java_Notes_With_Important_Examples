package _08_Object_Oriented_Concepts._4_Abstraction;

//abstract parent class
abstract class parent
{
    public abstract void abstractFunction(); //abstract method without body/implementation

    void regularFunction()
    {
        System.out.println("This ia a normal method");
    }
}

//child class
class child extends parent
{

    @Override
    public void abstractFunction() //overriding abstract method
    {
        System.out.println("This is abstract method which is overriding in child class");
        System.out.println("Providing implementation in child class for an abstract method");
    }
}

public class _1_abstraction_simple_example
{
    public static void main(String[] args)
    {
        child childObject  = new child();
        childObject.abstractFunction();
        childObject.regularFunction();
    }
}

//output
//This is abstract method which is overriding in child class
//Providing implementation in child class for an abstract method
//This ia a normal method