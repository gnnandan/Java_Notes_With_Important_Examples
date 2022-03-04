import java.nio.charset.Charset;
import java.util.Arrays;

public class _34_replace_uppercase_lowercase_viceversa_STRING
{
    public static void main(String[] args)
    {
        String str= "This Is A Really Simple Sentence";

        StringBuffer sbf = new StringBuffer();

        for (int i=0;i< str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                sbf.append(Character.toLowerCase(str.charAt(i)));
            }
            else if(Character.isLowerCase(str.charAt(i)))
            {
                sbf.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println("After swapping the case of string '"+str+"' :"+sbf);
    }
}
