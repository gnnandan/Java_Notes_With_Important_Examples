public class _19_largest_smallest_in_array
{
    public static void main(String[] args)
    {
        double[] numArray = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };

        double largest = 0;
        double smallest = 0;
        for(double num:numArray)
        {
            if(largest<num)
            {
                largest = num;
            }

            if(largest>num)
            {
                smallest = num;
            }
        }
        System.out.println("The largest number in an array is: "+largest);
        System.out.println("The smallest number in an array is: "+smallest);
    }
}
