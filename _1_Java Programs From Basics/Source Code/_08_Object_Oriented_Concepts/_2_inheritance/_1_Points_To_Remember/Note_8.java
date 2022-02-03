package _08_Object_Oriented_Concepts._2_inheritance._1_Points_To_Remember;

/**
 * @Note-8
 * Even though the parameterized constructor of a sub-class is called yet,
 * the default constructor in the super class is executed first
 * then the parameterized constructor of the sub-class is executed.
 */
class parentClass44
{
    parentClass44()
    {
        //calls first
        System.out.println("This is default constructor of parent class");
    }
}

class childClass44 extends parentClass44
{
    childClass44()
    {
        super();
    }
    childClass44(int i, int j)
    {
        System.out.println("i is: "+i);
        System.out.println("j is: "+j);
    }
}


public class Note_8
{
    public static void main(String[] args)
    {
        childClass44 c4 = new childClass44(111,222);
    }
}
