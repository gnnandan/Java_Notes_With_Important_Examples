package Object_Oriented_Concepts._2_inheritance._3_Important_Keywords_And_Methods;

/**
 * @Note
 * super(): it is used to call the constructor of the parent class
 */

class parentClass11 //parent class
{
    int i, j; //instance variable declaration
    parentClass11() //constrictor
    {
        i=111; //instance variable initialization
        j=222;
    }
}

class childClass11 extends parentClass11 //child class
{
    childClass11()
    {
        super(); // which calls the constructor of parent class
    }

    void display()
    {
        System.out.println("i is: "+i);
        System.out.println("j is: "+j);
    }
}


public class super_method_defaultConstructor
{
    public static void main(String[] args)
    {
        childClass11 childClass11 = new childClass11();
        childClass11.display();
    }
}
