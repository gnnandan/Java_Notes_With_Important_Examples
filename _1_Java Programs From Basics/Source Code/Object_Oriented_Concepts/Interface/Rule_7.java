package Object_Oriented_Concepts.Interface;

interface union
{
    abstract void goal();
    abstract void branch();
}

class nandan implements union
{
    public void goal()
    {
        System.out.println("My goal is to become 'Entrepreneur'");
    }
    public void branch()
    {
        System.out.println("My Branch is 'Computer Science'");
    }

    //special method
    public void job()
    {
        System.out.println("Currently i'm working as a 'Software Engineer'");
    }
}

class yashas implements union
{
    public void goal()
    {
        System.out.println("My goal is to become 'Enginner'");
    }
    public void branch()
    {
        System.out.println("My Branch is 'Mechanical Engineering'");
    }

    public void job()
    {
        System.out.println("Currently i'm working as a 'System Engineer'");
    }
}

class reference
{
    public void reunion(union u)
    {
        u.goal();
        u.branch();
    }
}

public class Rule_7
{
    public static void main(String[] args)
    {
        nandan p1 = new nandan();
        yashas p2 = new yashas();
        reference r = new reference();

        r.reunion(p1);
        System.out.println();
        r.reunion(p2);

        System.out.println();
        ((nandan)(p1)).job();
        System.out.println();
        ((yashas)(p2)).job();
    }
}
