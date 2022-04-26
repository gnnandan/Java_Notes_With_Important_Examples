package Review;

public class _17_factors_of_number
{
    public static void main(String[] args)
    {
        int num = 10;
        factorNumber(num);
    }

    static void factorNumber(int num)
    {
        System.out.print("Prime Factors of number "+num+": ");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
