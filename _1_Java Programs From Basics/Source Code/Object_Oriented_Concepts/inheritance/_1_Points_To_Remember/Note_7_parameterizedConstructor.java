package Object_Oriented_Concepts.inheritance._1_Points_To_Remember;

class parentClass33
{
    int i,j;
    parentClass33(int k)
    {
        i=111;
        j=222;
        System.out.println("k is: "+k);
    }
}

class childClass33 extends parentClass33
{
    childClass33()
    {
        //pass the parameter
        super(333);
    }

    void display()
    {
        System.out.println("i is: "+i);
        System.out.println("j is: "+j);
    }
}


public class Note_7_parameterizedConstructor
{
    public static void main(String[] args)
    {
        childClass33 c3 = new childClass33();
        c3.display();
    }
}
