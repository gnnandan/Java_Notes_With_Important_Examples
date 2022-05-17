package _14_File_Handling;

import java.io.File;
import java.io.IOException;

public class _3_File_Methods
{
    public static void main(String[] args) throws IOException
    {
        fileMethods();
    }

    static void fileMethods() throws IOException
    {
        //create directory
            //check directory is existed or not
        //create a file inside the directory
            //check file is existed or not
        File file = new File("C:\\Users\\NANDANGN\\Desktop\\Learning Resources\\Java Notes With Important Examples\\_1_Java Programs From Basics\\Source Code\\_14_File_Handling\\Files","fileMethods");

        file.mkdir(); //creates directory
        System.out.println("Directory Existence? "+file.exists());

        //creates a file
        File newFile = new File("C:\\Users\\NANDANGN\\Desktop\\Learning Resources\\Java Notes With Important Examples\\_1_Java Programs From Basics\\Source Code\\_14_File_Handling\\Files\\fileMethods","fileMethods.txt");
        newFile.createNewFile();
        System.out.println("File Existence? "+newFile.exists());
        System.out.println("File or not? "+newFile.isFile());

        //listing directories
        System.out.println("-----File List-----");
        String directories[] = file.list();
        int fileCount = 0;
        for(String list: directories)
        {
            fileCount++;
            System.out.println(list);
        }
        System.out.println("Total file count inside directory: "+fileCount);
    }
}
