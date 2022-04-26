package Review;

import java.util.Scanner;

public class _11_reversing_the_number
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num =scanner.nextInt();

        int reverse=0;
        while(num!=0)
        {
            //get remainder
            int remainder  = num % 10;

            //provide the reverse logic
            reverse = reverse * 10 + remainder;
            num = num/10;
        }

        System.out.println("The reverse of number is: "+reverse);
    }
}
