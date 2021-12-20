package Object_Oriented_Concepts.inheritance._1_Points_To_Remember;

/**
 * @Note-8
 * Even though the parameterized constructor of a sub-class is called yet,
 * the default constructor in the super class is executed first
 * then the parameterized constructor of the sub-class is executed.
 */
class parentClass55
{
    int i,j;
    parentClass55()
    {
        //calls first
        System.out.println("This is default constructor of parent class");
    }
}

class childClass55 extends parentClass55
{

    childClass55(int i, int j)
    {
        super();//to call default constructor of parentClass_3

        // to point the variable we use this (solves shadow problem)
        this.i=i;
        this.j=j;
    }

    void display()
    {
        System.out.println("i is: "+i);
        System.out.println("j is: "+j);
    }
}



public class Note_8_Version2
{
    public static void main(String[] args)
    {
        childClass55 c5 = new childClass55(111,222);//since it is a parameterized constructor in 'childClass55'. So we need to pass value
        c5.display();
    }
}
