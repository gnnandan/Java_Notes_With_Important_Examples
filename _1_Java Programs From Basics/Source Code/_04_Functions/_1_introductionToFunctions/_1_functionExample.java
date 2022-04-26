package _04_Functions._1_introductionToFunctions;

public class _1_functionExample
{
    public static void main(String[] args)
    {
        System.out.println("Inside Main Function");

        //calling a function
        func();
    }

    //creating a function
    static void func()
    {
        //inside function
        System.out.println("Inside The User Defined Function");
    }
}

//output
//Inside Main Function
//Inside The User Defined Function
