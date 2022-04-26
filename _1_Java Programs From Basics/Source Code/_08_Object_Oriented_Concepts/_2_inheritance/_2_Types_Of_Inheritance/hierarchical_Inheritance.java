package _08_Object_Oriented_Concepts._2_inheritance._2_Types_Of_Inheritance;

class sameParent //parent class
{
    public void methodA()
    {
        System.out.println("Parent Class");
    }
}
class child1 extends sameParent
{
    public void methodB() // child class 1
    {
        System.out.println("Hierarchical Inheritance: child class 1");
    }
}
class child2 extends sameParent //child class 2
{
    public void methodC()
    {
        System.out.println("Hierarchical Inheritance: child class 2");
    }
}
class child3 extends sameParent //child class 3
{
    public void methodD()
    {
        System.out.println("Hierarchical Inheritance: child class 3");
    }
}

public class hierarchical_Inheritance
{
    public static void main(String[] args)
    {
        //here 3 different inherits(Child classes). So we created separate  object for each inherit
        child1 c1 = new child1();
        child2 c2 = new child2();
        child3 c3 = new child3();
        c1.methodA();
        c1.methodB();
        c2.methodC();
        c3.methodD();
    }
}
