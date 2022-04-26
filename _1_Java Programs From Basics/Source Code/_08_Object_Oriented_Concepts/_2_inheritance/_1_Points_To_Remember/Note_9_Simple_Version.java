package _08_Object_Oriented_Concepts._2_inheritance._1_Points_To_Remember;

class parent
{
    parent()
    {
        System.out.println("Parent class default constructor with no parameter");
    }

    parent(int i, int j)
    {
        this(); //used to call the constructor of same class from different constructor, HERE (no Parameters)
        System.out.println("i is: "+i);
        System.out.println("j is: "+j);
    }
}

class child extends parent
{
    child()
    {
        super(111,222); //used to call the constructor of parent class, HERE (Parameters int , int)
        System.out.println("Child class default constructor with no parameters");
    }
}

public class Note_9_Simple_Version
{
    public static void main(String[] args)
    {
        System.out.println("Main method: Program Starts");
        child cc = new child();
        System.out.println("Main method: Program Ends");
    }
}
