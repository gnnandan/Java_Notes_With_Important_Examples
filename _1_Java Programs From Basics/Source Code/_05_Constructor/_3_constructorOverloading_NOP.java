package _05_Constructor;

class numOfParameters
{
    numOfParameters()
    {
        System.out.println("Default constructor: No Parameter");
    }

    numOfParameters(String s)
    {
        this(); //used to call the constructor of same class
        System.out.println(s);
    }
}

public class _3_constructorOverloading_NOP
{
    public static void main(String[] args)
    {
        //calling parameterized constructor of type string
        numOfParameters overloading_1 = new numOfParameters("Parameterized constructor: With Parameter Of Type String");
    }
}

//output
//Default constructor: No Parameter
//Parameterized constructor: With Parameter Of Type String
