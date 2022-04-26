package Object_Oriented_Concepts_Examples._01_Class_And_Object;

//class
class numbers
{
    //data members
    int startNum;
    int endNum;

    //member functions
    public void normalOrder(int startNum,int endNum)
    {
        for(int i=startNum;i<=endNum;i++)
        {
            System.out.print(i+" ");
        }
    }

    //member functions
    public void reverseOrder(int startNum,int endNum)
    {
        System.out.println();
        for(int i=endNum;i>=startNum;i--)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

class alphabets
{
    public void normalOrder()
    {
        for(char ch='a';ch<='z';ch++)
        {
            System.out.print(ch+" ");
        }
        System.out.println();
    }

    public void reverseOrder()
    {
        for(char ch='z';ch>='a';ch--)
        {
            System.out.print(ch+" ");
        }
        System.out.println();
    }
}


public class _1_simple_Example
{
    public static void main(String[] args)
    {
        //calling class by creating an object
        numbers num = new numbers();
        num.normalOrder(1,10);
        num.reverseOrder(1,10);

        alphabets alpha = new alphabets();
        alpha.normalOrder();
        alpha.reverseOrder();
    }
}

