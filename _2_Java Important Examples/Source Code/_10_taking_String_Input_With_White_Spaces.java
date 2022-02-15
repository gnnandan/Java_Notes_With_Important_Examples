import java.util.Scanner;

public class _10_taking_String_Input_With_White_Spaces
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String data =scanner.nextLine();
        System.out.println("The input string is: "+data);

        data = data.replaceAll("\\s"," ");

        System.out.println("The input string with white space: "+data);
    }
}
