package _2_Algorithms._02_Searching_Algorithm._01_LinearSearch_Algorithm;

public class _6_LSA_Search_Maximum_Example
{
    public static void main(String[] args)
    {
        int data[] = {-1,-999,-1100,20,45,100};

        int ans = data[0];
        for(int i=0;i< data.length;i++)
        {
            if(data[i]>ans)
            {
                ans = data[i];
            }
        }
        System.out.println("The maximum element in an array is: "+ans);
    }
}
