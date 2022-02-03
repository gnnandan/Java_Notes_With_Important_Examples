package _06_Blocks_In_Java._2_Static_Block;

class staticBlockExample
{
    //instance block is A static block helps to initialize the static data members
    static
    {
        //the moment when we create an object and instance to a class the static block gets called at first
        System.out.println("This is Static block");
    }

    staticBlockExample()
    {
        System.out.println("Inside the default constructor");
    }
}

public class _1_staticBlock_Example
{
    public static void main(String[] args)
    {
        System.out.println("Execution Started");
        new staticBlockExample();
        System.out.println("Execution Ended");
    }
}
