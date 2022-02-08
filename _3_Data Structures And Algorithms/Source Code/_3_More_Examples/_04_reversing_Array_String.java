package _3_More_Examples;

import java.util.Arrays;

public class _04_reversing_Array_String
{
    public static void main(String[] args)
    {
        String name = "Nandan".toLowerCase();

        System.out.println("Before converting into char Array: "+name);


        //allocating character array size based on the string length
        char nameArray[] = new char[name.length()];

        //adding string element to the char array
        for(int i=0;i<name.length();i++)
        {
            //adding procedure
            nameArray[i] = name.charAt(i);
        }
        System.out.println("After converting into char Array: "+Arrays.toString(nameArray));


        System.out.println("Before reversing: "+Arrays.toString(nameArray));

        //reversing procedure using 2 pointer method[startIndex and endIndex]
        int startIndex = 0;
        int endIndex = nameArray.length-1;
        while(startIndex<endIndex)
        {
            //swapping process
            char temp = nameArray[startIndex];
            nameArray[startIndex] = nameArray[endIndex];
            nameArray[endIndex] = temp;
            startIndex ++;
            endIndex --;
        }

        System.out.println("After reversing: "+Arrays.toString(nameArray));
    }
}
