package _11_Exception_Handling;

public class _3_throw_keyword_example
{
    static void throwExample(int num1)
    {
        int num2=10;
        if(num1==0)
        {
            //throwing exception
            throw new ArithmeticException("Divisible by zero cause exception");
        }
        else
        {
            System.out.println("The value is: "+num2%num1);
        }
    }

    public static void main(String[] args)
    {
//        throwExample(0); //throws exception here "Divisible by zero cause exception"
        /*
            Exception in thread "main" java.lang.ArithmeticException: Divisible by zero cause exception
            at _11_Exception_Handling._3_throw_keyword_example.throwExample(_3_throw_keyword_example.java:11)
            at _11_Exception_Handling._3_throw_keyword_example.main(_3_throw_keyword_example.java:21)
         */
        throwExample(20);
    }
}

//output
//The value is: 10
