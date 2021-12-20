package Object_Oriented_Concepts.inheritance._3_Important_Keywords_And_Methods;

class parentClass111
{
    int i,j;
    parentClass111(int k)
    {
        i=111;
        j=222;
        System.out.println("k is: "+k);
    }
}

class childClass111 extends parentClass111
{
    childClass111()
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

public class super_method_ParameterizedConstructor
{
    public static void main(String[] args)
    {
        childClass111 c111 = new childClass111();
        c111.display();
    }
}
