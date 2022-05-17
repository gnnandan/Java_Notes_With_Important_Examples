package _14_File_Handling;

import java.io.File;
import java.io.IOException;

public class _2_File_concept_constructors
{
    public static void main(String[] args) throws IOException
    {
        //file class constructors
        //new File(String name);
        //new File(String subDirName, String name);
        //new File(File subDir, String name);
        createFileWD();
        createFileSD();
    }

    static void createFileWD() throws IOException
    {
        //create a file: new File(String name);
        File file = new File("fileConstructor.txt"); //creates in current working directory
        System.out.println("Check file in working directory? "+file.exists());

        //create a file
        file.createNewFile(); //creates a file

        System.out.println("Check file in working directory? "+file.exists());
    }

    static void createFileSD() throws IOException
    {
        //create a file: new File(String subDirName, String name);
        File file = new File("C:\\Users\\NANDANGN\\Desktop\\Learning Resources\\Java Notes With Important Examples\\_1_Java Programs From Basics\\Source Code\\_14_File_Handling\\Files","fileConstructor.txt"); //creates in current working directory

        System.out.println("Check file in sub-directory? "+file.exists()); //check file existence

        file.createNewFile(); //creates a file

        System.out.println("Check file in sub-directory? "+file.exists()); //check file existence
    }
}
