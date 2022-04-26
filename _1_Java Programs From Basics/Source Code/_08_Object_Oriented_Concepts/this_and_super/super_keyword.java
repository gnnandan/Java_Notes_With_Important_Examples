package _08_Object_Oriented_Concepts.this_and_super;

class parent
{
    String name="Nandan";
    int age = 22;
    String email = "gnnandan7@gmail.com";

    void method()
    {
        System.out.println("Parent class method");
    }
}

class child extends parent
{
    void access()
    {
        System.out.println("Using Super");

        //we are accessing the member of parent class
        System.out.println("Name: "+super.name);
        System.out.println("Age: "+super.age);
        System.out.println("Email: "+super.email);

        //accessing method of parent class
        super.method();
    }
}

public class super_keyword
{
    public static void main(String[] args)
    {
        child cc = new child();
        cc.access();
    }
}

//output
//Using Super
//Name: Nandan
//Age: 22
//Email: gnnandan7@gmail.com
//Parent class method