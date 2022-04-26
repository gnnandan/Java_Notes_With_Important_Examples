package _11_Exception_Handling;

public class _1_example_try_catch
{
    public static void main(String[] args)
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
    }
}

//output
//A try and catch block example
//The exception is: java.lang.ArrayIndexOutOfBoundsException: 10
//The Element is not present