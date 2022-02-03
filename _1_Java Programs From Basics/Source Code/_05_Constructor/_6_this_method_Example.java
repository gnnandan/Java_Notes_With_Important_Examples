package _05_Constructor;

class thisMethodExample
{
    private String name;
    private int id;
    private String email;
    private int phone;

    thisMethodExample()
    {
        System.out.println("this() method is used to call one constructor from another constructor");
    }

    thisMethodExample(String name, int id)
    {
        this(); //this method must be first statement while calling from another constructor
        this.name=name;
        this.id=id;
    }

    thisMethodExample(String name, int id, String email, int phone)
    {
        this(name,id); //in this method() we can call parameterized constructor with respective datatype
        this.email=email;
        this.phone=phone;
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Email: "+email);
        System.out.println("Phone: "+phone);

    }
}

public class _6_this_method_Example
{
    public static void main(String[] args)
    {
        new thisMethodExample("Nandan",12,"gnnandan7@gmail.com",123456789);
    }
}
