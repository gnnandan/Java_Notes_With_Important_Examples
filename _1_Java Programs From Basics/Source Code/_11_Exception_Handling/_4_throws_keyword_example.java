package _11_Exception_Handling;

public class _4_throws_keyword_example
{
    static void funcPasswordCheck(String password) throws Exception
    {
        if(password!="password@123")
        {
            throw new Exception("Your Password is incorrect...! try again");
        }
        else
        {
            System.out.println("Access granted... You entered a right password");
        }
    }
    public static void main(String[] args) throws Exception
    {
        //funcPasswordCheck("123"); //exception occurred for incorrect password
        /*
        Exception in thread "main" java.lang.Exception: Your Password is incorrect...! try again
        at _11_Exception_Handling._4_throws_keyword_example.funcPasswordCheck(_4_throws_keyword_example.java:9)
        at _11_Exception_Handling._4_throws_keyword_example.main(_4_throws_keyword_example.java:18)
         */

        funcPasswordCheck("password@123");

    }
}
//output
//Access granted... You entered a right password