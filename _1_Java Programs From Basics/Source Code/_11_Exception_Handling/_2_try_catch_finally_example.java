package _11_Exception_Handling;

public class _2_try_catch_finally_example
{
    public static void main(String[] args)
    {
        try
        {
            int num1 = 100;
            int num2 = 0;

            int value = num1/num2;

            System.out.println("The value is: "+value);
        }
        catch(Exception e)
        {
            System.out.println("The type of exception is: "+e);
            System.out.println("Invalid data");
        }
        finally
        {
            System.out.println("Finally executed");
        }
    }
}
//output
//The type of exception is: java.lang.ArithmeticException: / by zero
//Invalid data
//Finally executed
