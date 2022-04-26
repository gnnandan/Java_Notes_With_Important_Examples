package _08_Object_Oriented_Concepts._3_Polymorphism;

class ParentData
{
    void function()
    {
        System.out.println("This is parent class method");
    }
}

class ChildData extends ParentData
{
    void function()
    {
        System.out.println("This is child class method");
    }
    void specialMethod()
    {
        System.out.println("This is child special method");
    }
}


public class _6_downcasting
{
    public static void main(String[] args)
    {
        ParentData pd = new ChildData();
        pd.function();

//        pd.specialMethod() error we can't able tp access it using parent reference
//        ChildData cd = new ParentData(); gives error

        ChildData child_data = (ChildData) pd; //down casting to access special method
        child_data.specialMethod();
    }
}

//output
//This is child class method
//This is child special method