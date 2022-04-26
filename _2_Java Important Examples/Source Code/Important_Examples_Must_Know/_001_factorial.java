package Important_Examples_Must_Know;

public class _001_factorial
{
    public static void main(String[] args)
    {
        int number =10;

        factorialWhile(10);//calling function
    }

    static void factorialWhile(int number) //function that takes parameter of type "int"
    {
        int factorial = 1;
        int i = 1;
        while(i<=number)
        {
            factorial = factorial * i;
            i++;
        }
        System.out.println("The factorial of number "+number+" is: "+factorial);
    }
}

//output
//The factorial of number 10 is: 3628800