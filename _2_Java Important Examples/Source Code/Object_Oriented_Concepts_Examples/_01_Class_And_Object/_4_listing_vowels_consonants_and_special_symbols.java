package Object_Oriented_Concepts_Examples._01_Class_And_Object;

class differentiate
{
    StringBuilder vowels  = new StringBuilder(100);
    StringBuilder consonants  = new StringBuilder(100);
    StringBuilder specialSymbol  = new StringBuilder(100);

    public void keepOnlyVowels(String str)
    {
        str = str.toLowerCase();
        char v[] = str.toCharArray();

        for(char ch: v)
        {
            //System.out.print(ch+" ");
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels.append(ch);
            }
        }
        System.out.println("Only Vowels: "+vowels);
    }

    public void keepOnlyConsonants(String str)
    {
        str = str.toLowerCase();
        char c[] = str.toCharArray();

        for(char ch: c)
        {
            //System.out.print(ch+" ");
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && Character.isAlphabetic(ch))
            {
                consonants.append(ch);
            }
        }
        System.out.println("Only Consonants: "+consonants);
    }

    public void keepOnlySpecialSymbols(String str)
    {
        str = str.toLowerCase();
        char ss[] = str.toCharArray();
        for(char ch: ss)
        {
            //System.out.print(ch+" ");
            if(!Character.isAlphabetic(ch))
            {
                specialSymbol.append(ch);
            }
        }
        System.out.println("Only Special Symbols including digit: "+specialSymbol);
    }
}

public class _4_listing_vowels_consonants_and_special_symbols
{
    public static void main(String[] args)
    {
        differentiate obj = new differentiate();
        obj.keepOnlyVowels("gnnandan7@gmail.com");
        obj.keepOnlyConsonants("gnnandan7@gmail.com");
        obj.keepOnlySpecialSymbols("gnnandan7@gmail.com");
    }
}
