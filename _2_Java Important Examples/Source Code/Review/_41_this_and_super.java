package Review;

class thisEx
{
    thisEx()
    {
        System.out.println("Default constructor Parent Class");
    }
    thisEx(int a)
    {
        this();
        System.out.println("Parameterized constructor");
    }
}

class superEx extends thisEx
{
    superEx()
    {
        super(10);
        System.out.println("Default constructor Child Class");
    }
}

public class _41_this_and_super
{
    public static void main(String[] args)
    {
        superEx ex = new superEx();

    }
}
