package Object_Oriented_Concepts.Interface;

interface c1
{
    abstract void add();
}

interface c2
{
    abstract void sub();
}

class result implements c1,c2
{
    public void add()
    {
        int a=10,b=20,c;
        c = a + b;
        System.out.println("The sum of "+a+" and "+b+" is "+c);
    }
    public void sub()
    {
        int a=20,b=10,c;
        c= a-b;
        System.out.println("The difference between "+a+" and "+b+" is "+c);
    }
}

public class Rule_8
{
    public static void main(String[] args)
    {
        result result = new result();
        result.add();
        result.sub();
    }
}
