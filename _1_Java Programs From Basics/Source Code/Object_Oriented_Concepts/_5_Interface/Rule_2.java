package Object_Oriented_Concepts._5_Interface;


//If a class implements the interface then it should provide the body for all the methods present in the interface class.
//If the class is not in a position to provide the body for all the method  then class should be made as abstract.

interface calculates
{
    abstract void add();
    abstract void product();
}

abstract class addition implements calculate
{
    public void add()
    {
        int a = 10, b = 20, c;
        c = a+b;

        System.out.println("The sum of "+a+" and "+b+" is "+c);
    }
    abstract public void product();
}

abstract class products implements calculates
{
    abstract public void add();
    public void product()
    {
        int a = 10, b = 20, c;
        c = a*b;
        System.out.println("The product of "+a+" and "+b+" is "+c);
    }
}

public class Rule_2
{
    public static void main(String[] args)
    {

    }
}

