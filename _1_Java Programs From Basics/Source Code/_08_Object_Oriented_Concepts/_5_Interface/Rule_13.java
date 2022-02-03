package _08_Object_Oriented_Concepts._5_Interface;

interface operation
{
    abstract void add();
    abstract void diff();
    abstract void product();
}

abstract class calculator implements operation
{
    public void add()
    {
        int a = 10, b = 20, c;
        c = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+c);
    }
    abstract public void diff();
    abstract public void product();
}

//child class gives body if abstract is not able to give the body
class juniorCalculator extends calculator
{
    public void add()
    {
        int a = 10, b = 20, c;
        c = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+c);
    }
    public void diff()
    {
        int a = 20, b = 10, c;
        c = a-b;
        System.out.println("The difference of "+a+" and "+b+" is "+c);
    }
    public void product()
    {
        int a = 10, b = 20, c;
        c = a*b;
        System.out.println("The product of "+a+" and "+b+" is "+c);
    }

}

public class Rule_13
{
    public static void main(String[] args)
    {
        juniorCalculator jc = new juniorCalculator();
        jc.add();
        jc.diff();
        jc.product();
    }
}
