package Most_Important_Examples._1_Informative_Examples;

public class _004_finding_ASCII_equivalent
{
    public static void main(String[] args)
    {
        //input string
        String s = "curiousdevelopers.in";

        //logic
        for(int i=0;i<=s.length()-1;i++)
        {
            System.out.println("Char: "+s.charAt(i)+" ASCII: "+(int)s.charAt(i)); //type casting
        }
    }
}

//output
//Char: c ASCII: 99
//Char: u ASCII: 117
//Char: r ASCII: 114
//Char: i ASCII: 105
//Char: o ASCII: 111
//Char: u ASCII: 117
//Char: s ASCII: 115
//Char: d ASCII: 100
//Char: e ASCII: 101
//Char: v ASCII: 118
//Char: e ASCII: 101
//Char: l ASCII: 108
//Char: o ASCII: 111
//Char: p ASCII: 112
//Char: e ASCII: 101
//Char: r ASCII: 114
//Char: s ASCII: 115
//Char: . ASCII: 46
//Char: i ASCII: 105
//Char: n ASCII: 110