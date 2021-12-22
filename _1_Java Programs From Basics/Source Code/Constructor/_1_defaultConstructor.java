package Constructor;
class data
{
    String Name = "Nandan";
    String usn = "1";
    //default constructor
    data()
    {
        System.out.println("This is default constructor");
        this.Name = Name;
        this.usn = usn;
    }

    void display()
    {
        System.out.println("Name is: "+Name);
        System.out.println("USN is: "+usn);
    }
}

public class _1_defaultConstructor
{
    public static void main(String[] args)
    {
        /**
         * @Note
         * The movement when we create an object to object constructor is called
         * when ever we create an object to a class immediately constructor gets called
         */
        data data  = new data();
        data.display();
    }
}
