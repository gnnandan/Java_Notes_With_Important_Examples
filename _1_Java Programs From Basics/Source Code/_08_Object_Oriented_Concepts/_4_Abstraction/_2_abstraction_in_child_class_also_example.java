package _08_Object_Oriented_Concepts._4_Abstraction;

abstract class carManufacture
{
    abstract void brand();
    abstract void made();
}

abstract class tesla extends carManufacture
{
    //implementation to the brand function
    void brand()
    {
        System.out.println("Tesla brand manufactured by tesla automobiles");
    }

    //doesn't have implementation to the made function, so it will inherit
    abstract void made();
}

class tata extends tesla
{
    @Override
    void brand()
    {
        System.out.println("Tata brand manufactured by tata automobiles");
    }

    void made()
    {
        System.out.println("Tata is proud indian brand");
    }
}

public class _2_abstraction_in_child_class_also_example
{
    public static void main(String[] args)
    {
        tata car1 = new tata();
        car1.brand();
        car1.made();
    }
}
//output
//Tata brand manufactured by tata automobiles
//Tata is proud indian brand