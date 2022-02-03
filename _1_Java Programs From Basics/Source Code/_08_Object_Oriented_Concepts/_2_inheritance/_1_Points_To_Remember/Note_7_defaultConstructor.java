package _08_Object_Oriented_Concepts._2_inheritance._1_Points_To_Remember;

/**
 * @Note-7
 * Unlike the private members constructors are also doesn't participate in the _2_inheritance.
 */

class parentClass22
{
    int i, j; //instance variable declaration
    parentClass22() //constrictor
    {
        i=111; //instance variable initialization
        j=222;
    }
}

class childClass22 extends parentClass22
{
    childClass22()
    {
        super(); // which calls the constructor of parent class
    }

    void display()
    {
        System.out.println("i is: "+i);
        System.out.println("j is: "+j);
    }
}



public class Note_7_defaultConstructor
{
    public static void main(String[] args)
    {
        childClass22 c2 = new childClass22();
        c2.display();
    }
}
