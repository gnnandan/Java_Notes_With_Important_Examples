package _08_Object_Oriented_Concepts._4_Abstraction;

abstract class data
{
    //constructor
    data()
    {
        System.out.println("This is constructor");
    }

    //abstract methods
    abstract void name();
    abstract void contact();

    //final methods
    final void finalMethod()
    {
        System.out.println("Please mention your name and ask your queries");
    }
}

class siteData extends data
{

    @Override
    void name()
    {
        System.out.println("Name: My name is Curious Developers");
    }

    @Override
    void contact()
    {
        System.out.println("Gmail: curiousdevelopers.community@contact.com");
    }
}

class contactData extends data
{

    @Override
    void name()
    {
        System.out.println("visit: curiousdevelopers.in");
    }

    @Override
    void contact()
    {
        System.out.println("write to us: curiousdevelopers.community@contact.com");
        System.out.println("Or you can fill the contact form about queries");
    }
}


public class _9_abstraction_with_final_method_and_constructor
{
    public static void main(String[] args)
    {
        data data0 = new siteData(); //parent reference child object: polymorphism used to access the final method
        data0.finalMethod(); //final method access using parent reference

        siteData data1 = new siteData();
        data1.name();
        data1.contact();

        contactData data2 = new contactData();
        data2.name();
        data2.contact();
    }
}
//output
//Please mention your name and ask your queries
//This is constructor
//Name: My name is Curious Developers
//Gmail: curiousdevelopers.community@contact.com
//This is constructor
//visit: curiousdevelopers.in
//write to us: curiousdevelopers.community@contact.com
//Or you can fill the contact form about queries