package Review;

public class _37_finding_duplicates_word_in_STRING
{
    public static void main(String[] args)
    {
        String string = "Big black bug bit a big black dog on his big black nose";

        String word[] = string.toLowerCase().split(" ");

        int count =1;
        for(int i=0;i<word.length;i++)
        {
            count =1;
            for(int j =i+1;j< word.length;j++)
            {
                if(word[i].equals(word[j]))
                {
                    count++;
                    word[j]="0";
                }
            }
            if(count > 1 && word[i] != "0")
            {
                System.out.print(word[i]+" ");
            }
        }
    }
}
