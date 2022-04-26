package _04_Functions._1_introductionToFunctions;

public class _6_purpose_of_returntype
{
    public static void main(String[] args)
    {
        double sum = sumFunc(10,20); //storing the "sumFunc()" in a variable of same returning datatype
        System.out.println("The sum is: "+sum); //displaying the result
    }

    //a parameterized method
    static double sumFunc(int a, int b)
    {
        //initially sum is 0
        double sum = 0;
        System.out.println("The value of a: "+a); //display a;
        System.out.println("The value of b: "+b); //display b;
        sum = a+b;

        //returning the value here "sum" of datatype "double"
        return sum;
    }
}

//output
//The value of a: 10
//The value of b: 20
//The sum is: 30.0
