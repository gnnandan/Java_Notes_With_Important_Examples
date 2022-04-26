package Most_Important_Examples._2_Arrays_Examples;

public class _001_simple_example
{
    public static void main(String[] args)
    {
        /*
        Way - 1       {DECLARATION}
        int [] marks; {MEMORY ALLOCATION}
        marks  = new int[5];

        //adding elements
        marks[0]  = 100;
        marks[1] = 87;
        marks[2] = 88;
        marks[3] = 76;
        marks[4]= 75;
        */

        /*
        Way - 2 {DECLARATION + INITIALIZATION + MEMORY ALLOCATION}
        int marks[] = {100, 87,88,76,75}
        */

        // Way - 3 single line declaration you can also do
        int marks[] = {100, 87,88,76,75}; //1 - d array


        //displaying array
        for(int i=0;i< marks.length;i++)
        {
            System.out.print(marks[i]+" "); //display elements
        }
    }
}

//output
// 100 87 88 76 75