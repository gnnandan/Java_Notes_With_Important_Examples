package _04_Functions._1_introductionToFunctions;

public class _3_multipleFunction
{
    public static void main(String[] args)
    {
        System.out.println("Multiple Functions Example");
        System.out.println("-----Execution Starts-----");
        func1();
        func2(); //calling functions
        func3();
        System.out.println("-----Execution Stops-----");
    }

    //function 1
    static void func1()
    {
        System.out.println("inside function 1");
    }

    //function 2
    static void func2()
    {
        System.out.println("inside function 2");
    }

    //function 3
    static void func3()
    {
        System.out.println("inside function 3");
    }

}

//output
//Multiple Functions Example
//-----Execution Starts-----
//inside function 1
//inside function 2
//inside function 3
//-----Execution Stops-----