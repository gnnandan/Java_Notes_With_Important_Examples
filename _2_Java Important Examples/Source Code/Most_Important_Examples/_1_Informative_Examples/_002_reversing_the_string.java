package Most_Important_Examples._1_Informative_Examples;

public class _002_reversing_the_string
{
    public static void main(String[] args)
    {
        //normal string
        String str = "Hello World...!";

        String revStr = "";

        //logic
        for(int i=str.length()-1;i>=0;i--) //reading string from reverse
        {
            //concatenating to the empty string called revStr
            revStr = revStr+str.charAt(i); //here "charAt(i)" is concatenating the character to revStr
        }

        System.out.println("The Normal string str: "+str);
        System.out.println("The Reverse string revStr: "+revStr);
    }
}

//output
//The Normal string str: Hello World...!
//The Reverse string revStr: !...dlroW olleH