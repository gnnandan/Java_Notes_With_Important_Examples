package _13_File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class _4_FileWriter_and_FileReader_concept_1
{
    public static void main(String[] args) throws IOException
    {

        //create a file using FileWriter
        String path = "C:\\Users\\NANDANGN\\Desktop\\Learning Resources\\Java Notes With Important Examples\\fileHandlingFiles/fileWriterExample.txt";
        File file = new File(path);

        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write("Namasthe..!\n");
        fileWriter.write("Namaskar..!\n");
        fileWriter.write("Hello..!\n");
        fileWriter.write("Hola..!\n");

        fileWriter.close();

        FileReader fileReader = new FileReader(file);

        //System.out.println(fileReader.read());

        char data[] = new char[(int)file.length()]; //to read file data we need to use char array
        fileReader.read(data); //pass those character array to read
        System.out.print(Arrays.toString(data)); //convert it to string array and print the content

    }
}
//The disadvantage of FileReader is it will read the data in the form of characters.
