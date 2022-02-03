package _08_Object_Oriented_Concepts._2_inheritance._2_Types_Of_Inheritance;

class sameParent
{
    public void methodA()
    {
        System.out.println("method of Parent Class");
    }
}
class child1 extends sameParent
{
    public void methodB()
    {
        System.out.println("method of Child Class-1 of same parent class");
    }
}
class child2 extends sameParent
{
    public void methodC()
    {
        System.out.println("method of Child Class-2 of same parent class");
    }
}
class child3 extends sameParent
{
    public void methodD()
    {
        System.out.println("method of Child Class-3 of same parent class");
    }
}

public class hierarchical_Inheritance
{
    public static void main(String[] args)
    {
        //here 3 different inherits. So we created separate  object for each inherit
        child1 c1 = new child1();
        child2 c2 = new child2();
        child3 c3 = new child3();
        c1.methodA();
        c1.methodB();
        c2.methodC();
        c3.methodD();
    }
}
