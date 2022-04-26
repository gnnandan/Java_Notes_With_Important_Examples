package Review;

public class _20_finding_element_present_in_array
{
    public static void main(String[] args)
    {
        int[] num = {1, 2, 3, 4, 5};
        int findEle = 3;

        boolean flag=false;
        for(int eles:num )
        {
            if(findEle == eles)
            {
                flag =true;
            }
        }

        if(flag==true)
        {
            System.out.println("The element "+findEle+" is present an array...!");
        }
        else
        {
            System.out.println("The element "+findEle+" is not found an array...!");
        }
    }
}
