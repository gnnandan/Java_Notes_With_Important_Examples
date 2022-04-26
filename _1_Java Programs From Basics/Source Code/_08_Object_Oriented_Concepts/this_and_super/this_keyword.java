package _08_Object_Oriented_Concepts.this_and_super;

class thisKeywordEx
{
    String s  = "aaa"; //instance variable

    thisKeywordEx()
    {
        //String s = "AAA";//---->shadow problem causing here
        this.s = "AAA";
        System.out.println("The value of 's' is: "+s);

    }
}

public class this_keyword
{
    public static void main(String[] args)
    {
        System.out.println("Main Method");
        new thisKeywordEx();

    }
}

//output
//Main Method
//The value of 's' is: AAA