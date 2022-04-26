package Most_Important_Examples._2_Arrays_Examples;

public class _003_largest_and_smallest_element
{
    public static void main(String[] args)
    {
        //array
        double[] numArray = { 23.4, 34.5, 50.0, 33.5, 55.5, 43.7, 5.7, 66.5, 100, -201.4 };

        //initialize largest and smallest to 0 initially
        double largest = 0;
        double smallest = 0;

        //iterate in array
        for(double num:numArray)
        {
            //condition: if iterated element is larger, then update largest
            if(num > largest)
            {
                largest = num;
            }

            //condition: if iterated element is smaller, then update smallest
            if(num < largest)
            {
                smallest = num;
            }
        }

        //print the value
        System.out.println("The largest number in an array is: "+largest);
        System.out.println("The smallest number in an array is: "+smallest);
    }
}

//output
//The largest number in an array is: 100.0
//The smallest number in an array is: -201.4