package _08_Object_Oriented_Concepts._5_Interface;

//interface 1
interface addOperation
{
    public abstract void sum();
}

//interface 2
interface subOperation
{
    public abstract void diff();
}

//implementing class implements multiples interfaces
class implementing_Class implements addOperation,subOperation
{
    //instance variables
    int a = 10;
    int b = 20;
    int sum = a+b;
    int diffs = b-a;
    @Override
    public void sum()
    {
        System.out.println("The sum of "+a+" and "+b+" is: "+sum);
    }

    @Override
    public void diff()
    {
        System.out.println("The diff of "+a+" and "+b+" is: "+diffs);
    }
}

public class _3_implementing_class_with_multiple_interface
{
    public static void main(String[] args)
    {
        implementing_Class obj = new implementing_Class();
        obj.sum();
        obj.diff();
    }
}
//output
//The sum of 10 and 20 is: 30
//The diff of 10 and 20 is: 10