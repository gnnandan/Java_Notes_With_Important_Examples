package _2_Algorithms._02_Searching_Algorithm._01_LinearSearch_Algorithm;

public class _4_LSA_Search_In_Range_Example
{
    public static void main(String[] args)
    {
        int data[] = {0,1,24,11,456,300,-1,2};

        //finding element 11 in the range 2 to 6
        int target = 11;

        System.out.println("The target found: "+target);

    }
    static int search(int data[],int target)
    {
        if(data.length==0)
        {
            return -1;
        }
        for(int i=2; i< data.length;i++)
        {
            if(data[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
