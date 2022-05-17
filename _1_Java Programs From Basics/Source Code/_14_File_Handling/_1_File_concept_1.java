//file concepts
package _14_File_Handling;

import java.io.File;

public class _1_File_concept_1
{
    public static void main(String[] args)
    {
        //check if file exists
        File chkList = new File("C:\\Users\\NANDANGN\\Desktop\\Learning Resources\\Java Notes With Important Examples\\_1_Java Programs From Basics\\Source Code\\_14_File_Handling\\Files\\welcome.txt");
        System.out.println("File present? "+chkList.exists());

        //file name
        System.out.println("File name? "+chkList.getName());

        //get path
        System.out.println("File path? "+chkList.getPath());

        //get parent file
        System.out.println("File parent? "+chkList.getParent());
    }
}
