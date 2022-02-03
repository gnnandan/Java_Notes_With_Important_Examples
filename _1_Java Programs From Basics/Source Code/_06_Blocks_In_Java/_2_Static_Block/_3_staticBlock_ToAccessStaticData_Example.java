package _06_Blocks_In_Java._2_Static_Block;

import jdk.internal.dynalink.beans.StaticClass;

class staticBlockToAccess
{
    static String data; //static
    {
        data = "String data: This is common to entire class";
        System.out.println("Accessing data: "+data);
    }

}
public class _3_staticBlock_ToAccessStaticData_Example
{
    public static void main(String[] args)
    {
        System.out.println("Static block Can Also Be used To Initialize static variables");
        System.out.println("Execution Started");
        new staticBlockToAccess();
        System.out.println("Execution Ended");
    }
}
