package _04_Functions._1_method_overloading;

public class _3_method_overloading_ORP
{
    public static void main(String[] args)
    {
        System.out.println("Main method");
        function(10, 100.3f); //int and float
        System.out.println();
        function(100.3f,10); //float and int
    }

    //Method Overloading: order of parameter int a and float b
    static void function(int a, float b)
    {
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }

    //Method Overloading: order of parameter float a and float b
    static void function(float a, int b)
    {
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
}

//output
//Main method
//Value of a: 10
//Value of b: 100.3
//Value of a: 100.3
//Value of b: 10