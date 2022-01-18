package Object_Oriented_Concepts._2_inheritance._4_Methods_With_Respect_To_Inheritance;

class Parent
{
    void marry()
    {
        System.out.println("marry @ age of 26");								// overriding method happening here in child class
    }
}
class Child extends Parent
{
    void marry()
    {
        System.out.println("marry @ age of 30");                                // overriding method w.r.t child class
    }
    void job()
    {
        System.out.println("Job is Mandatory");
    }
}

public class overridingMethod
{
    public static void main(String[] args)
    {
        Child c  = new Child();
        c.marry();
        c.job();
    }
}
