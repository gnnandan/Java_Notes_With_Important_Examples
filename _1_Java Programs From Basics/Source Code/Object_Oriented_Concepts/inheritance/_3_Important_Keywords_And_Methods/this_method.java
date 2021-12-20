package Object_Oriented_Concepts.inheritance._3_Important_Keywords_And_Methods;

class aa
{
    aa()
    {
        System.out.println("This is default constructor inside parent class");
    }
    aa(String s)
    {
        this();
        System.out.println("Calling another constructor of same class using 'this() method' inside parent class");
        System.out.println(s);
    }
}

class bb extends aa
{
    bb()
    {
        super("calling parent class parameterized constructor");
        System.out.println("This is default constructor inside child class");
    }
    bb(String s)
    {
        this();
        System.out.println("Calling another constructor of same class using 'this() method' inside child class");
        System.out.println(s);
    }
}

public class this_method
{
    public static void main(String[] args)
    {
        bb b = new bb("calling child class parameterized constructor");
    }
}
