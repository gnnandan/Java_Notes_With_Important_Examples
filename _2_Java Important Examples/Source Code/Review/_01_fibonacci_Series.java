package Review;

import java.util.Scanner;

public class _01_fibonacci_Series
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        System.out.print("The fibonacci series of "+terms+" terms are: ");
        fib(terms);
    }
    static void fib(int count)
    {
        int firstTerm = 0;
        int secondTerm = 1;

        for(int i=0;i<=count;i++)
        {
            System.out.print(firstTerm+", ");
            int nextTerm = firstTerm + secondTerm;

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
