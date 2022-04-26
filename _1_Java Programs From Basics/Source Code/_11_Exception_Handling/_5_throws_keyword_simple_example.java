package _11_Exception_Handling;
public class _5_throws_keyword_simple_example
{
    public static void main(String[] args) throws Exception
    {
        String s ="abc";

        if(s == "abc")
        {
            throw new Exception("Exception occurred");
        }
        else
        {
            System.out.println("Program execution completed");
        }
    }
}
//output
//Exception in thread "main" java.lang.Exception: Exception occurred
//at _11_Exception_Handling._5_throws_keyword_simple_example.main(_5_throws_keyword_simple_example.java:13)
