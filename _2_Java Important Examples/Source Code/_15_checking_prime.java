public class _15_checking_prime
{
    public static void main(String[] args)
    {
        int num = 12;

        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println("The number "+num+" is prime number");
                break;
            }
            else
            {
                System.out.println("The number "+num+" is not a prime number");
            }
        }
    }
}
