package Most_Important_Examples._2_Arrays_Examples;

public class _004_find_element_is_there_or_not
{
    public static void main(String[] args)
    {
        //declare array
        int[] num = {1, 2, 3, 4, 5};

        //consider which element to find
        int findEle = 2;

        System.out.println("The finding element: "+findEle);

        //consider boolean = false initially
        boolean flag = false;

        //iterate over array using foreach
        for(int i:num)
        {
            //if the element is present change the flag as true
            if(findEle == i)
            {
                flag = true;
            }
        }

        //if flag is true then print element is present or else not present
        if(flag==true)
        {
            System.out.println("The element "+findEle+" is present");
        }
        else
        {
            System.out.println("The element "+findEle+" is not present");
        }
    }
}

//output
//The finding element: 2
//The element 2 is present