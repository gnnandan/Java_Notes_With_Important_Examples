package Object_Oriented_Concepts.Interface;

interface a1
{
    abstract void name();
}

interface a2 extends a1
{
    abstract void fullname();
}

class a implements a2
{
    public void name()
    {
        System.out.println("My name is 'Nandan' ");
    }
    public void fullname()
    {
        System.out.println("My fullname is 'Nandan G N' ");
    }
}

public class Rule_15
{
    public static void main(String[] args)
    {
        a implementsClass = new a();
        implementsClass.name();
        implementsClass.fullname();
    }
}
