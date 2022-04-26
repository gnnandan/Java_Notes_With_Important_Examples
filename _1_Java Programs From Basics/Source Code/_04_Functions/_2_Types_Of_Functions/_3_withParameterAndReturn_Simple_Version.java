package _04_Functions._2_Types_Of_Functions;


public class _3_withParameterAndReturn_Simple_Version
{
    public static void main(String[] args)
    {
        //since returning value is string, So we are storing in "string variable"
        String returnVal = func(10); //argument type "10" is passed for the parameter "int"
        System.out.println(returnVal);
    }

    static String func(int a) //taking parameter "int" and returning "string value"
    {
        System.out.println("The value of a: "+a);

        //return statement
        return "Hello World"; //returning String
    }
}

//output
//The value of a: 10
//Hello World