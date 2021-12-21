package Object_Oriented_Concepts.Polymorphism;

class vehicle
{
    void brand()//form1
    {
        System.out.println("My favourite cycle, bike, and car brand");
    }
}

class cycle extends vehicle
{
    void brand()//form2
    {
        System.out.println("My favourite cycle brand is 'POLYGON & HERO' ");
    }
}

class bike extends vehicle
{
    void brand()//form3
    {
        System.out.println("My favourite bike brand is 'HERO, HONDA, & ATHER' ");
    }
}

class car extends vehicle
{
    void brand()//form4
    {
        System.out.println("My favourite car brand is 'TATA, TESLA, & HYUNDAI' ");
    }
}

public class _1_polymorphismExample
{
    public static void main(String[] args)
    {
        //---------reference
        vehicle collections  = new vehicle();//creating reference to parent class

        //parent reference to child objects(new cycle, new car, new bike)
        collections = new cycle();
        collections.brand();
        System.out.println();
        collections = new bike();
        collections.brand();
        System.out.println();
        collections = new car();
        collections.brand();
    }
}
