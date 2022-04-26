package Review;

public class _16_prime_numbers_between_intervals
{
    public static void main(String[] args)
    {
        int low = 20;
        int high = 50;
        while (low <high)
        {
            if(primelogic(low))
            {
                System.out.print(low+" ");
            }
            low++;
        }
    }

    static boolean primelogic(int num)
    {
        boolean flag = true;
        for(int i=2;i<=num/2;i++)
        {
            if(num %i==0)
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
}
