package _06_Blocks_In_Java._1_Instance_Block;

class instanceBlockExample
{
    //instance block is used to provide the logic which doesn't change, and it is common for all objects
    {
        //the moment when we create an object and instance to a class the instance block gets called at first
        System.out.println("This is Instance block");
    }

    instanceBlockExample()
    {
        System.out.println("Inside the default constructor");
    }
}

public class _1_instanceBlock_Example
{
    public static void main(String[] args)
    {
        System.out.println("Execution Started");
        new instanceBlockExample();
        System.out.println("Execution Ended");

    }
}
