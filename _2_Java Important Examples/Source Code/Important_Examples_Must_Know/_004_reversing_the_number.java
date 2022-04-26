package Important_Examples_Must_Know;

public class _004_reversing_the_number
{
    public static void main(String[] args)
    {
        int num = 12345;
        revNumber(num);
    }

    //function to reverse the number
    static void revNumber(int num) //function that takes parameter type "num"
    {
        int reverse =0;
        while (num!=0)
        {
            int lastDigit = num % 10;
            reverse = (reverse * 10)+lastDigit;
            num = num/10;
        }
        System.out.println("The reverse of number is: "+reverse);
    }
}
