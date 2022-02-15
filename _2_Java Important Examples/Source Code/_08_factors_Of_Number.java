import java.util.Scanner;

public class _08_factors_Of_Number
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num =scanner.nextInt();

        System.out.print("The factors of number "+num+": ");
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num % i == 0)
            {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("The number of factors are: "+count);
    }
}
