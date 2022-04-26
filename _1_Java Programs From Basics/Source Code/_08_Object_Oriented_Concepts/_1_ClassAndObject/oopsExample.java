package _08_Object_Oriented_Concepts._1_ClassAndObject;

//this is class
class car
{
    //member function
    void brand(String brandType)
    {
        System.out.println("Car brand is: "+brandType);
    }
    void brand(int a)
    {
        System.out.println("Car brand is: "+a);
    }
}

//main class
public class oopsExample
{
    public static void main(String[] args)
    {
        car tata = new car();  //object 1
        tata.brand("TATA");

        car mahindra = new car(); //object 2
        mahindra.brand("MAHINDRA");

        car tesla = new car(); //object 3
        tesla.brand("TESLA");

        tesla.brand(10);
    }
}
