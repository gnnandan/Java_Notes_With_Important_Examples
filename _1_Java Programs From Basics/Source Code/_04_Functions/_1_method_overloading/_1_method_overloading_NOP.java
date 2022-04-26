package _04_Functions._1_method_overloading;

public class _1_method_overloading_NOP
{
    public static void main(String[] args)
    {
        System.out.println("Main Method");
        func();
        func("Inside function 2");
    }

    //func 1
    static void func()
    {
        System.out.println("Inside function 1");
    }

    //func 1 is overloaded with number of parameter
    static void func(String s) //we added one number of parameter of type "String"
    {
        System.out.println(s);
        System.out.println("Overloading with Number Of Parameter");
    }
}

//output
//Main Method
//Inside function 1
//Inside function 2
//Overloading with Number Of Parameter