package Important_Examples_Must_Know;

public class _005_display_char_a_to_z_and_z_to_a
{
    public static void main(String[] args)
    {
        //calling function
        a_to_z();
        z_to_a();
    }

    //function to display a to z
    static void a_to_z()
    {
        //loop
        for(char ch='a';ch<='z';ch++) //loop from actual order
        {
            System.out.print(ch+" ");
        }
        System.out.println();
    }

    //function to display z to a
    static void z_to_a()
    {
        for(char ch='z';ch>='a';ch--)//loop from reverse order
        {
            System.out.print(ch+" ");
        }
    }
}
//output
//a b c d e f g h i j k l m n o p q r s t u v w x y z
//z y x w v u t s r q p o n m l k j i h g f e d c b a