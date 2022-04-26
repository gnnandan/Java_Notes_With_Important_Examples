package _01_GettingStartedToJava._001_Pre_Post_Increment_and_Decrement;

import jdk.nashorn.internal.ir.Assignment;

public class _1_example
{
    public static void main(String[] args)
    {
        int i=10;

        System.out.println("Assignment and increment");
        //System.out.println(i++);//output: 10

        System.out.println("increment and Assignment");
        //System.out.println(++i);//output: 11

        System.out.println("Assignment and decrement");
        //System.out.println(i--); //output: 10

        System.out.println("decrement and Assignment");
        //System.out.println(--i); //output: 9
    }
}
