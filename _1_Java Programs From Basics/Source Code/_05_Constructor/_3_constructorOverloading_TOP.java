package _05_Constructor;

class typeOfParameter
{
    typeOfParameter()
    {
        System.out.println("Default constructor: No Parameter");
    }

    typeOfParameter(String s)
    {
        this(); //used to call the constructor of same class
        System.out.println(s);
    }

    typeOfParameter(int a) //constructor overloading done with the type of parameter
    {
        System.out.println("The value of a: "+a);
    }
}
public class _3_constructorOverloading_TOP
{
    public static void main(String[] args)
    {
        new typeOfParameter("Parameterized constructor: With Parameter Of Type String");
        new typeOfParameter(10); //with parameter of type "int"
    }
}

//output
//Default constructor: No Parameter
//Parameterized constructor: With Parameter Of Type String
//The value of a: 10