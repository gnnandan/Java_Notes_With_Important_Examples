package Most_Important_Examples._1_Informative_Examples;

public class _001_fibonacci_series
{
    public static void main(String[] args)
    {
        int firstTerm = 0; // firstTerm: 0
        int secondTerm = 1; // second term: 1
        int nextTerm; //like 0+1
        int count = 10; //terms

        System.out.print("The fibonacci series of "+count+" terms: ");
        //looping
        for(int i=0;i<=count;i++)
        {
            //print first term = 0
            System.out.print(firstTerm+" ");

            //get next term by adding firstTerm & secondTerm Ex: 0 + 1
            nextTerm = firstTerm + secondTerm;

            //to find nextTerm =  secondTerm will become firstTerm Ex: 2 = 1 + 1
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        //0, 1, 0+1 = 1, 1+1 = 2, 2+1 = 3, 3+2 = 5.....
    }
}
//output
//The fibonacci series of 10 terms: 0 1 1 2 3 5 8 13 21 34 55