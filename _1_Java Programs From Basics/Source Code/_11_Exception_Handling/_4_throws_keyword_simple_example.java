package _11_Exception_Handling;

public class _4_throws_keyword_simple_example
{
    static void function(int num2) throws ArithmeticException
    {
        int num1 = 100;
        if(num2==0)
        {
            throw new ArithmeticException("Zero division error occurred");
        }
        else
        {
            System.out.println("The value is: "+num2%num1);
        }
    }

    public static void main(String[] args)
    {
        //function(0); //exception occurred

        /*
        Exception in thread "main" java.lang.ArithmeticException: Zero division error occurred
        at _11_Exception_Handling._4_throws_keyword_simple_example.function(_4_throws_keyword_simple_example.java:10)
        at _11_Exception_Handling._4_throws_keyword_simple_example.main(_4_throws_keyword_simple_example.java:20)
         */

        function(10);
    }
}
