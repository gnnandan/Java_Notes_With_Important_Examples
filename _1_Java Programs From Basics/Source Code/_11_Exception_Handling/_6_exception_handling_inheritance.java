package _11_Exception_Handling;

class parent
{
    void func()
    {
        System.out.println("Parent class with no exception");
    }
}

class child extends parent
{
    void func()
    {
        System.out.println("A try and catch block example");
        try
        {
            int arr[] = {1,2,3,4,5,6};
            System.out.println("The number: "+arr[10]);
        }
        catch (Exception e)
        {
            System.out.println("The exception is: "+e);
            System.out.println("Something went wrong");
        }
        finally
        {
            System.out.println("The code has been executed successfully");
        }
    }

}

public class _6_exception_handling_inheritance
{
    public static void main(String[] args)
    {
        child child  = new child();
        child.func();
    }
}

//output
//A try and catch block example
//The exception is: java.lang.ArrayIndexOutOfBoundsException: 10
//Something went wrong
//The code has been executed successfully