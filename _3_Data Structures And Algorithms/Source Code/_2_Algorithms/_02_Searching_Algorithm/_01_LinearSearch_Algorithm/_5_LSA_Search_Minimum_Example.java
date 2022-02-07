package _2_Algorithms._02_Searching_Algorithm._01_LinearSearch_Algorithm;

public class _5_LSA_Search_Minimum_Example
{
    public static void main(String[] args)
    {
        int data[] = {-1,-999,-1100,20,45,100};
        System.out.println("The minimum element is: "+findMin(data));
    }
    static int findMin(int data[])
    {
        //initially we assume that data[0] is minimum
        int ans=data[0];
        for (int i = 0; i < data.length; i++)
        {
            if(data[i]<ans)
            {
                //if we found minimum to current value update the answer variable
                ans = data[i];
            }
        }
        return ans;
    }
}
