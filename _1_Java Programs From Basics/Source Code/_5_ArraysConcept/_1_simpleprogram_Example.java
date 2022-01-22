package _5_ArraysConcept;

// Array is collection of similar datatypes
public class _1_simpleprogram_Example
{
    public static void main(String[] args)
    {
        //ways - 1 {DECLARATION AND MEMORY ALLOCATION}
        int [] marks = new int[5];

        /*
        Way - 2       {DECLARATION}
        int [] marks; {MEMORY ALLOCATION}
        marks  = new int[5];
        */

        /*
        Way - 3 {DECLARATION + INITIALIZATION + MEMORY ALLOCATION}
        int marks[] = {100, 87,88,76,75}
        */

        //adding or initializing data  to array
        marks[0]  = 100;
        marks[1] = 87;
        marks[2] = 88;
        marks[3] = 76;
        marks[4]= 75;
        System.out.println("Accessing individual elements: "+marks[0]);

    }
}
