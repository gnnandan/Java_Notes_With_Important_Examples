package Object_Oriented_Concepts.Interface;

class normalClass
{
    public void insideNormalClass()
    {
        System.out.println("Inside the normal class");
    }
}

interface interfaceClass
{
    abstract void insideInterfaceClass();
}


class extendsClass extends normalClass implements interfaceClass
{
    public void insideInterfaceClass()
    {
        System.out.println("Inside the interface class");
    }
}

public class Rule_17
{
    public static void main(String[] args)
    {
        extendsClass extendsClassObject = new extendsClass();
        extendsClassObject.insideNormalClass();
        extendsClassObject.insideInterfaceClass();
    }
}
