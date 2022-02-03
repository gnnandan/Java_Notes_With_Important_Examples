package _08_Object_Oriented_Concepts._5_Interface.Adapter_Class;

interface adbstractMethods
{
    abstract void method1();
    abstract void method2();
    abstract void method3();
    abstract void method4();
}

class Adapter implements adbstractMethods
{
    @Override
    public void method1()
    {

    }

    @Override
    public void method2()
    {
        //adapter class can have empty methods
    }

    @Override
    public void method3()
    {
        //adapter class can have empty methods
    }

    @Override
    public void method4()
    {

    }
}

class test1 extends Adapter
{
    public void method2()
    {
        System.out.println("inside method 2");
    }
}

class test2 extends  Adapter
{
    public void method3()
    {
        System.out.println("inside method 3");
    }
}

public class _1_adapterClassEx1
{
    public static void main(String[] args)
    {
        test1 t1= new test1();
        t1.method2();
        test2 t2 = new test2();
        t2.method3();
    }
}
