package _06_Blocks_In_Java._2_Static_Block;

class multipleStaticBlock
{
    static
    {
        System.out.println("First: Static Block ");
    }

    static
    {
        System.out.println("Second: Static Block ");
    }

    static
    {
        System.out.println("Third: Static Block ");
    }

    //constructor
    multipleStaticBlock()
    {
        System.out.println("Inside the default constructor");
    }
}

public class _2_multiple_staticBlock_Example
{
    public static void main(String[] args)
    {
        System.out.println("Execution Started");
        new multipleStaticBlock();
        System.out.println("Execution Ended");
    }
}
