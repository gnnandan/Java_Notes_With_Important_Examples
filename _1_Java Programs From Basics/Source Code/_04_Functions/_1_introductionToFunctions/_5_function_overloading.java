package _04_Functions._1_introductionToFunctions;

/**
 * @Function/Method Overloading
 * Same method name but different parameters
 */

public class _5_function_overloading
{
    public static void main(String[] args)
    {
        sum(10,20);
        sum("Nandan","GN");
    }


    static void sum(int a, int b)
    {
        int c = a + b;
        System.out.println("The sum is "+c);
    }

    static void sum(String s1, String s2)
    {
        String concatString = s1+" "+s2;
        System.out.println("After concatenation: "+concatString);
    }
}
