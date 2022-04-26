package Most_Important_Examples._1_Informative_Examples;

public class _001_fibonacci_series_do_while_loop
{
    public static void main(String[] args)
    {
        int firstTerm = 0; // firstTerm = 0
        int secondTerm = 1; // second term = 1
        int nextTerm;
        int terms = 10; //number of terms needed = 0+1 like...

        System.out.print("The fibonacci series of "+ terms +" terms: ");

        //looping
        int count =0; //counter
        do
        {
            //logic
            System.out.print(firstTerm+" ");
            nextTerm = firstTerm + secondTerm;

            firstTerm = secondTerm;
            secondTerm = nextTerm;

            count++; //increment
        }while(count<=terms); //condition

        //0, 1, 0+1 = 1, 1+1 = 2, 2+1 = 3, 3+2 = 5.....
    }
}
//output
//The fibonacci series of 10 terms: 0 1 1 2 3 5 8 13 21 34 55