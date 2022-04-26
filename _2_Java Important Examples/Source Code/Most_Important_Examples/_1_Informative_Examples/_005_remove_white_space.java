package Most_Important_Examples._1_Informative_Examples;

public class _005_remove_white_space
{
    public static void main(String[] args)
    {
        String s = "Hello World From Curious Developers";

        //way 1
        System.out.println("Way - 1: "+s.replace(" ",""));

        //way 2
        StringBuilder noSpace = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != ' ')
            {
                noSpace = noSpace.append(s.charAt(i));
            }
        }
        System.out.println("Way - 2: "+noSpace);
    }
}
//output
//Way - 1: HelloWorldFromCuriousDevelopers
//Way - 2: HelloWorldFromCuriousDevelopers