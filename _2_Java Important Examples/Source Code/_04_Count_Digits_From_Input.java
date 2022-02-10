public class _04_Count_Digits_From_Input
{
    public static void main(String[] args)
    {
        countDigit("Nandan1234");
    }

    static void countDigit(String str)
    {
        int count =0;
        char c[]= str.toCharArray();

        StringBuilder stringBuilder =  new StringBuilder();
        for(char ch: c)
        {
            if(Character.isDigit(ch))
            {
                stringBuilder.append(ch);
            }
        }


        System.out.println("The numbers in string: "+stringBuilder);
    }
}
