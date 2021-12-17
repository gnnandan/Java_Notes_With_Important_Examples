package Object_Oriented_Concepts.Interface;

interface calculate1
{
    void add();
}
interface calculate2
{
    void sub();
}
interface calculate3 extends calculate1,calculate2
{
    void mul();
}

class Test implements calculate3
{
    public void add()
    {
        int a,b,c;
        a=10;
        b=20;
        c=a+b;
        System.out.println("Sum: "+c);
    }
    public void sub()
    {
        int a,b,c;
        a=20;
        b=05;
        c=a-b;
        System.out.println("Difference: "+c);
    }
    public void mul()
    {
        int a,b,c;
        a=20;
        b=05;
        c=a*b;
        System.out.println("Product: "+c);
    }

}

public class Rule_14
{
    public static void main(String[] args)
    {
        Test test = new Test();
        test.add();
        test.sub();
        test.mul();
    }
}
