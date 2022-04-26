package _08_Object_Oriented_Concepts._3_Polymorphism;

//parent class
class parent
{
    void show()
    {
        System.out.println("Before Overriding: show()");
    }
}

//child class
class child extends parent
{
    void show() //overriding happening here
    {
        System.out.println("After Overriding: show()");
    }
}

public class _4_methodOverriding_Simple_Example
{
    public static void main(String[] args)
    {
        //parent reference child object
        parent parent = new child();
        parent.show();
    }
}

//output
//After Overriding: show()