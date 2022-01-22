package _5_ArraysConcept;

public class _3_multidimensioanlarray_Example
{
    public static void main(String[] args)
    {
        //multidimensional array
        int[][] num = {{01,02,03},{11,22,33}};


        //displaying array
        for(int i = 0; i< num.length;i++)
        {
            for(int j = 0; j<num[i].length;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
