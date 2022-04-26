package Review;

public class _18_sum_and_average_of_array
{
    public static void main(String[] args)
    {
        double arr[] = {45.3, 67.5, -45.6, 20.34, 33.0, 45.6};
        int sum = 0;

        for(int i=0;i< arr.length;i++)
        {
            sum= (int) (sum+arr[i]);
            //System.out.println(sum);
        }

        System.out.println("The sum of array is: "+sum);

        int average = sum/ arr.length;
        System.out.println("the average of array: "+average);
    }
}
