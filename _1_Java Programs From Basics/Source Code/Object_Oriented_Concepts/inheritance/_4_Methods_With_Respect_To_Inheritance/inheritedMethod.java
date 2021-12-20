package Object_Oriented_Concepts.inheritance._4_Methods_With_Respect_To_Inheritance;

class vehicle
{
    String type;
    void wheels()
    {
        System.out.println("Different vehicle has different number of wheels");
    }
    void power()
    {
        System.out.println("Different vehicle has different power");
    }
}

class bike extends vehicle
{
    void wheels() //inherited method
    {
        super.type = "bike";
        System.out.println(type+" has 2 wheels");
    }

    void power()
    {
        super.type = "bike";
        System.out.println(type+" has less power");
    }
}

class car extends vehicle
{
    void wheels() //inherited method
    {
        super.type = "car";
        System.out.println(type+" has 4 wheels");
    }

    void power()
    {
        super.type = "car";
        System.out.println(type+" has more power");
    }
}

public class inheritedMethod
{
    public static void main(String[] args)
    {
        bike b = new bike();
        b.wheels();
        b.power();

        System.out.println();

        vehicle v = new vehicle();
        v.wheels();
        v.power();
    }
}
