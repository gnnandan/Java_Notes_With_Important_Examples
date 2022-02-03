package _06_Blocks_In_Java._1_Instance_Block;

class instanceBlockToAccess
{
    String data;
    {
        data = "String data: This is common to entire class";
        System.out.println("Accessing data: "+data);
    }

}
public class _3_instanceBlock_ToAccessCommonData_Example
{
    public static void main(String[] args)
    {
        System.out.println("Instance Variable Can Also Be used To Initialize Instance Variables");
        System.out.println("Execution Started");
        new instanceBlockToAccess();
        System.out.println("Execution Ended");
    }
}
