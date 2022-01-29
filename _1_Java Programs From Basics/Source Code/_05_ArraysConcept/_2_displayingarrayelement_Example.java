package _05_ArraysConcept;

public class _2_displayingarrayelement_Example
{
    public static void main(String[] args)
    {
        int marks[] = {100, 87,88,76,75};
        //System.out.println("Accessing the array: "+marks[3]);
        System.out.println("Checking the length of array: "+marks.length);

        System.out.println();

        //displaying an array
        System.out.println("Displaying an array element using for loop");
        for(int i=0; i< marks.length;i++)
        {
            System.out.println(marks[i]+" ");
        }

        System.out.println();
        System.out.println("Displaying an array element using foreach loop");
        for(int elements: marks)
        {
            System.out.println(elements);
        }

        System.out.println();
        //displaying or traversing array reversely
        System.out.println("Traversing array reversely");
        for(int i = marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }
    }
}
