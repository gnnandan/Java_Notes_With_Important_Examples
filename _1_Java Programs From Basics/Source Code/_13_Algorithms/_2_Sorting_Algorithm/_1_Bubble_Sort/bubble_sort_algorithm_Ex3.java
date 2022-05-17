package _13_Algorithms._2_Sorting_Algorithm._1_Bubble_Sort;

import java.util.Arrays;

public class bubble_sort_algorithm_Ex3
{
    public static void main(String[] args)
    {
        String str = "vduqcueukbvienilnivstcfalkmalmosjiohdvydv;][;[].;.2w837940823yy987hdsbucvydvbanknxsibcuc";
        char cArray[] = str.toCharArray();
        bubbleSort_Ex3(cArray);
    }

    static void bubbleSort_Ex3(char arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        countChar(arr);
        System.out.println("The sorted characters are: "+ Arrays.toString(arr));
    }

    static void countChar(char arr[])
    {
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int fCount = 0;
        int gCount = 0;
        int hCount = 0;
        int iCount = 0;
        int jCount = 0;
        int kCount = 0;
        int lCount = 0;
        int mCount = 0;
        int nCount = 0;
        int oCount = 0;
        int pCount = 0;
        int qCount = 0;
        int rCount = 0;
        int sCount = 0;
        int tCount = 0;
        int uCount = 0;
        int vCount = 0;
        int wCount = 0;
        int xCount = 0;
        int yCount = 0;
        int zCount = 0;

        int specialSymbolCount = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] =='a')
            {
                aCount++;
            }
            else if(arr[i] =='b')
            {
                bCount++;
            }
            else if(arr[i] == 'c')
            {
                cCount++;
            }
            else if(arr[i] =='d')
            {
                dCount++;
            }
            else if(arr[i] == 'e')
            {
                eCount++;
            }
            else if(arr[i] =='f')
            {
                fCount++;
            }
            else if(arr[i] == 'g')
            {
                gCount++;
            }
            else if(arr[i] =='h')
            {
                hCount++;
            }
            else if(arr[i] == 'i')
            {
                iCount++;
            }
            else if(arr[i] =='j')
            {
                jCount++;
            }
            else if(arr[i] == 'k')
            {
                kCount++;
            }
            else if(arr[i] =='l')
            {
                lCount++;
            }
            else if(arr[i] == 'm')
            {
                mCount++;
            }
            else if(arr[i] =='n')
            {
                nCount++;
            }
            else if(arr[i] == 'o')
            {
                oCount++;
            }
            else if(arr[i] =='p')
            {
                pCount++;
            }
            else if(arr[i] == 'q')
            {
                qCount++;
            }
            else if(arr[i] =='r')
            {
                rCount++;
            }
            else if(arr[i] == 's')
            {
                sCount++;
            }
            else if(arr[i] =='t')
            {
                tCount++;
            }
            else if(arr[i] == 'u')
            {
                uCount++;
            }
            else if(arr[i] =='v')
            {
                vCount++;
            }
            else if(arr[i] == 'w')
            {
                wCount++;
            }
            else if(arr[i] =='x')
            {
                xCount++;
            }
            else if(arr[i] == 'y')
            {
                yCount++;
            }
            else if(arr[i] =='z')
            {
                zCount++;
            }
            else
            {
                specialSymbolCount++;
            }
        }


        System.out.println("The number of 'a': "+aCount);
        System.out.println("The number of 'b': "+bCount);
        System.out.println("The number of 'c': "+cCount);
        System.out.println("The number of 'd': "+dCount);
        System.out.println("The number of 'e': "+eCount);
        System.out.println("The number of 'f': "+fCount);
        System.out.println("The number of 'g': "+gCount);
        System.out.println("The number of 'h': "+hCount);
        System.out.println("The number of 'i': "+iCount);
        System.out.println("The number of 'j': "+jCount);
        System.out.println("The number of 'k': "+kCount);
        System.out.println("The number of 'l': "+lCount);
        System.out.println("The number of 'm': "+mCount);
        System.out.println("The number of 'n': "+nCount);
        System.out.println("The number of 'o': "+oCount);
        System.out.println("The number of 'p': "+pCount);
        System.out.println("The number of 'q': "+qCount);
        System.out.println("The number of 'r': "+rCount);
        System.out.println("The number of 's': "+sCount);
        System.out.println("The number of 't': "+tCount);
        System.out.println("The number of 'u': "+uCount);
        System.out.println("The number of 'v': "+vCount);
        System.out.println("The number of 'w': "+wCount);
        System.out.println("The number of 'x': "+xCount);
        System.out.println("The number of 'y': "+yCount);
        System.out.println("The number of 'z': "+zCount);
        System.out.println("The number of 'Special Symbols Except Alphabets': "+ specialSymbolCount);
    }
}
