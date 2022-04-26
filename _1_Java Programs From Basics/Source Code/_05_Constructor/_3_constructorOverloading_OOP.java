package _05_Constructor;

class orderOfParameter
{
    orderOfParameter()
    {
        System.out.println("Default constructor: No Parameter");
    }

    orderOfParameter(int a1, double a2) //Overloading with order int and double
    {
        this(); //used to call the constructor of same class
        System.out.println("Overloading "+"\na1: "+a1+", a2: "+a2);
    }

    orderOfParameter(double a1, int a2) //Overloading with order double and int
    {
        System.out.println("Overloading "+"\na1: "+a1+", a2: "+a2);
    }
}

public class _3_constructorOverloading_OOP
{
    public static void main(String[] args)
    {
        new orderOfParameter(10,100.0); //Overloading With Parameters: int and double
        new orderOfParameter(100.0,10); //Overloading With Parameters: double and int
    }
}

//output
//Default constructor: No Parameter
//Overloading
//a1: 10, a2: 100.0
//Overloading
//a1: 100.0, a2: 10