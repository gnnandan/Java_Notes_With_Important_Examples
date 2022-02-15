import java.util.Scanner;

public class _07_factorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num =scanner.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.println("The factorial of num: "+num+" is: "+fact);
    }
}
