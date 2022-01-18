package Object_Oriented_Concepts._2_inheritance._3_Important_Keywords_And_Methods;

/**
 * @Note
 * super keyword   : it is used to access the instance variable  of parent class.
 */
class parent
{
    String name="Nandan";
    int age = 22;
    String email = "gnnandan7@gmail.com";
}

class child extends parent
{
    void access()
    {
        System.out.println("Super keyword is used to access the variables of parent class");
        System.out.println("My name is: "+super.name);
        System.out.println("My age is: "+super.age);
        System.out.println("My email is: "+super.email);

    }
}


public class super_keyword
{
    public static void main(String[] args)
    {
        child child = new child();
        child.access();
    }
}
