package Constructor;

import java.util.Scanner;

class Data
{
    Data(String Name, String Usn)
    {
        System.out.println("This is parameterized constructor");
        System.out.println("Name is: "+Name);
        System.out.println("USN is: "+Usn);
    }
}



public class _2_parameterizedConstructor
{
    public static void main(String[] args)
    {
        Scanner info = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = info.next();
        System.out.print("Enter USN: ");
        String usn = info.next();

        /**@Note - when we use parameterized constructor we need to pass the same datatype argument during object creation
         *
         */
        Data data = new Data(name,usn);
    }
}
