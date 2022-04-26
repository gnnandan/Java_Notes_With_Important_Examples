package Important_Examples_Must_Know;

public class _003_prime_factors
{
    public static void main(String[] args)
    {
        int number = 34;
        System.out.print("The prime factor of number "+number+" is: ");
        primeFactor(number);//calling a function
    }

    //function that performs prime factorization
    static void primeFactor(int number)
    {
        //logic starts from here
        for(int i=2;i<=number;i++)
        {
            while(number%i==0)
            {
                System.out.print(i+" "); //to print the starting prime number '2'
                number = number/i;
            }
        }
    }
}

//output
//The prime factor of number 34 is: 2 17
