package Object_Oriented_Concepts_Examples._01_Class_And_Object;

//class to remove duplicate character
class duplicateChar
{
    String str;

    public void logicChar(String str)
    {
        char duplicates[] = str.toCharArray();
        int count;
        System.out.print("Duplicate characters: ");
        for(int i=0;i< duplicates.length;i++)
        {
            count=1;
            for(int j=i+1;j< duplicates.length;j++)
            {
                if(duplicates[i] == duplicates[j] && duplicates[i]!=' ')
                {
                    count++;

                    //if duplicates found immediate after replace that character with character '0'
                    duplicates[j]='0';
                }
            }
            if(count>1 && duplicates[i]!='0')
            {
                System.out.print(duplicates[i]+" ");
            }
        }
        System.out.println();
    }
}

//class to remove duplicate word
class duplicateWord
{
    public void logicWord(String str)
    {
        String duplicates[] = str.toLowerCase().split(" ");
        int count;
        System.out.print("\nDuplicate words: ");
        for(int i=0;i<duplicates.length;i++)
        {
            count=1;
            for(int j=i+1;j<duplicates.length;j++)
            {
                if(duplicates[i].equals(duplicates[j]))
                {
                    count++;
                    duplicates[j]= "0";
                }
            }
            if(count>1 && duplicates[i]!="0")
            {
                System.out.print(duplicates[i]+" ");
            }
        }
    }
}

public class _2_count_duplicates
{
    public static void main(String[] args)
    {
        duplicateChar chars = new duplicateChar();
        chars.logicChar("Big black bug bit a big black dog on his big black nose");

        duplicateWord words = new duplicateWord();
        words.logicWord("Big black bug bit a big black dog on his big black nose");
    }
}
