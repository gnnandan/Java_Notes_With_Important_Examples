package _06_Blocks_In_Java._1_Instance_Block;

class multipleInstanceBlock
{
    {
        System.out.println("First: Instance Block ");
    }

    {
        System.out.println("Second: Instance Block ");
    }

    {
        System.out.println("Third: Instance Block ");
    }

    //constructor
    multipleInstanceBlock()
    {
        System.out.println("Inside the default constructor");
    }
}

public class _2_multiple_instanceBlock_Example
{
    public static void main(String[] args)
    {
        System.out.println("Execution Started");
        new multipleInstanceBlock();
        System.out.println("Execution Ended");
    }
}
