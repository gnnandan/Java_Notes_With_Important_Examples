package Most_Important_Examples._1_Informative_Examples;

public class _003_filter_only_digits_from_character
{
    public static void main(String[] args)
    {
        String s  = "Hello World12345";

        s = s.toLowerCase();

        //convert string to charArray[]
        char c[] = s.toCharArray();

        //stringBuilder to append or to add the filter elements
        StringBuilder filter = new StringBuilder();

        //now do iteration
        for (char ch:c)
        {
            //condition
            if(Character.isDigit(ch))
            {
                filter = filter.append(ch); //append
            }
        }
        System.out.println("After filtering found rather than a character: "+filter);
    }
}
//output
//After filtering found rather than a character: 12345