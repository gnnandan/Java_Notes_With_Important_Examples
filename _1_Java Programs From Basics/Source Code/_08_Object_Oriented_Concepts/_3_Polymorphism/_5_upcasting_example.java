package _08_Object_Oriented_Concepts._3_Polymorphism;

//Parent Class
class parentData
{
    void function()
    {
        System.out.println("This is parent class method");
    }
}

//Child Class
class childData extends parentData
{
    void function()
    {
        System.out.println("This is child class method");
    }
}

public class _5_upcasting_example
{
    public static void main(String[] args)
    {
        //parent reference child object
        parentData pdata = new childData();

        //accessing child object with parent reference
        pdata.function();
    }
}
//output
//This is child class method