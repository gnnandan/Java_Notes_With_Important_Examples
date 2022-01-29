package _05_ArraysConcept;

import java.util.Scanner;

public class _7_checkvowelsorconsonant_Example
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = "Nandan";
        s = s.toLowerCase();

        int a_count =0,e_count =0,i_count =0,o_count =0,u_count =0, cons_count=0;
        //for loop to iterate over letters
        for(int i = 0; i<s.length();i++)
        {
            //System.out.println(s.charAt(i));
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                System.out.println("The string "+s+" contains vowels");
            }

            if(s.charAt(i)=='a')
            {
                a_count++;
            }
            else if(s.charAt(i) == 'e')
            {
                e_count++;
            }
            else if(s.charAt(i) == 'o')
            {
                o_count++;
            }
            else if(s.charAt(i)=='u')
            {
                u_count++;
            }
            else
            {
                cons_count++;
            }
        }
        System.out.println("The the string contains vowels and also consonants" +
                "\nVowels: "+
                "a: "+a_count+", " +
                "e: "+e_count+", " +
                "i: "+i_count+", " +
                "o: "+o_count+", " +
                "u: "+u_count+"" +
                "\nconsonants: "+cons_count);
    }

}
