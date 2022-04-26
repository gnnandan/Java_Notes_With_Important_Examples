package Most_Important_Examples._2_Arrays_Examples;

public class _002_sum_and_average_in_array
{
    public static void main(String[] args)
    {
        //array
        double arr[] = {45.3, 67.5, -45.6, 20.34, 33.0, 45.6};

        double sum =0; //initially sum is 0

        for(int i=0;i< arr.length;i++)
        {
            sum = sum + arr[i];
        }

        //finding average
        double avg = sum/ arr.length;

        System.out.println("The sum of array is: "+sum+" and the average is: "+avg);
    }
}
//output
//The sum of array is: 166.14 and the average is: 27.689999999999998