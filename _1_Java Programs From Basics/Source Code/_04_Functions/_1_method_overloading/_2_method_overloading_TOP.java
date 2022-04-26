package _04_Functions._1_method_overloading;

public class _2_method_overloading_TOP
{
    public static void main(String[] args)
    {
        System.out.println("Main Method");
        System.out.println("Overloading with Different Type Of Parameter");
        func(10);
        func("Hello World");
    }

    //func 1
    static void func(int a)
    {
        System.out.println("The vale of a: "+a);
    }

    //func 1 is overloaded with different type of parameter
    static void func(String s) //we added different type of parameter of type "String"
    {
        System.out.println("The value of s: "+s);
    }
}
//output
//Main Method
//Overloading with Different Type Of Parameter
//The vale of a: 10
//The value of s: Hello World
