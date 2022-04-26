package Object_Oriented_Concepts_Examples._01_Class_And_Object;

class keepAlphabetsOnly
{
    public void logics(String str)
    {
        char chrArray[] = str.toCharArray();

        StringBuilder sbf = new StringBuilder(chrArray.length);
        for(char ch:chrArray)
        {
            if(Character.isAlphabetic(ch))
            {
                sbf.append(ch);
            }
            //System.out.print(ch+" ");
        }
        System.out.println("After removing all special symbols including digits: "+sbf);
    }
}

public class _3_keep_only_alphabets
{
    public static void main(String[] args)
    {
        keepAlphabetsOnly obj  = new keepAlphabetsOnly();
        obj.logics("gnnandan7@gmail.com");
    }
}
