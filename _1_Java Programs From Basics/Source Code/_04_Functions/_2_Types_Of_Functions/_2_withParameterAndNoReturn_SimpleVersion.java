package _04_Functions._2_Types_Of_Functions;

public class _2_withParameterAndNoReturn_SimpleVersion
{
    public static void main(String[] args)
    {
        func(10, "Parameters Passed"); //calling function with same datatype argument "int and string"
    }

    //function with parameters of type "int and string"
    static void func(int a, String str)
    {
        System.out.println("The value Of a: "+a);
        System.out.println("The value Of str: "+str);

    }
}
//output
//The value Of a: 10
//The value Of str: Parameters Passed