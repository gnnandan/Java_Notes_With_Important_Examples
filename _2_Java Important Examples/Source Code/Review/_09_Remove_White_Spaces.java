package Review;

public class _09_Remove_White_Spaces
{
    public static void main(String[] args)
    {
        String name = "Nandan G N";

        String newName = name.replaceAll("\\s","");

        System.out.println("Before removing the white space: "+name);

        System.out.println("After removing the white space: "+newName);
    }
}
