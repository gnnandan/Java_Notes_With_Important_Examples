package Review;

public class _36_finding_duplicates_Character_in_STRING
{
    public static void main(String[] args)
    {
        String str="Great responsibility";

        char[] duplicate = str.toCharArray();
        int count;

        for(int i=0;i< duplicate.length;i++)
        {
            count =1;
            for(int j=i+1;j< duplicate.length;j++)
            {
                if(duplicate[i]==duplicate[j] && duplicate[i]!=' ')
                {
                    count++;

                    //visited is replaced with 0
                    duplicate[j]='0';
                }
            }
            if(count>1 && duplicate[i]!='0')
            {
                System.out.print(duplicate[i]+" ");
            }
        }

        //System.out.println(Arrays.toString(duplicate));
    }
}
