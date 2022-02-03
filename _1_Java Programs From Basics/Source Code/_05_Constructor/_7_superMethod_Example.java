package _05_Constructor;

class superMethodExample
{
    private String name;
    private int id;
    private String email;
    private int phone;

    superMethodExample()
    {
        System.out.println("super() method is used to call parent class constructor from child class constructor in Inheritance concept");
    }

    superMethodExample(String name, int id)
    {
        this(); //this method must be first statement while calling from another constructor
        this.name=name;
        this.id=id;
    }

    superMethodExample(String name, int id, String email, int phone)
    {
        //this() calls the constructs of same class with matching parameters
        this(name, id); //in this method() we can call parameterized constructor with respective datatype
        this.email=email;
        this.phone=phone;
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Email: "+email);
        System.out.println("Phone: "+phone);
    }
}

class childClass extends superMethodExample
{
    //calling parent class constructor
    childClass()
    {
        //super() calls parent class constructor of matching parameters
        super("Nandan",12,"gnnandan7@gmail.com",123456789);
    }
}

public class _7_superMethod_Example
{
    public static void main(String[] args)
    {
//        using child class instance we are calling default constructor of child class
        new childClass();
    }
}
