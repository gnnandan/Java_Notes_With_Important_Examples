public class _12_largest_of_3_numbers
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if(num1 > num2 && num1 > num3)
        {
            System.out.println("Number 1 is greater than Number 2 and Number 3: "+num1);
        }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.println("Number 2 is greater than Number 1 and Number 3: "+num2);
        }
        else
        {
            System.out.println("Number 3 is greater than Number 1 and Number 2: "+num3);
        }
    }
}
