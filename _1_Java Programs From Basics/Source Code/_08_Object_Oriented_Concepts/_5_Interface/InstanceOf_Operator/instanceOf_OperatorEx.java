package _08_Object_Oriented_Concepts._5_Interface.InstanceOf_Operator;


abstract class animals
{
    abstract void animalName();
    abstract void animalColor();
}

class cat extends animals
{
    String name = "CAT";
    public void animalName()
    {
        System.out.println("Animal Name is: "+name);
    }
    public void animalColor()
    {
        System.out.println(name+" color is white and so on...!");
    }
}

class dog extends animals
{
    String name = "DOG";
    public void animalName()
    {
        System.out.println("Animal Name is: "+name);
    }
    public void animalColor()
    {
        System.out.println(name+" color is brown and so on...!");
    }
}


public class instanceOf_OperatorEx
{
    public static void main(String[] args)
    {
        cat a1 = new cat();
        dog a2 = new dog();
        a1.animalName();
        a1.animalColor();
        System.out.println();

        a2.animalName();
        a2.animalColor();

        //let's check the instance of
        /**@instanceOf
         * It is a boolean operator,it can be used to check whether the specified reference variable is
         * representing the specified class object or not that is compatible or not.
         */
        System.out.print("checking whether 'a1' is instance of class 'cat': ");
        System.out.println(a1 instanceof cat);
        System.out.print("checking whether 'a2' is instance of class 'dog': ");
        System.out.println(a2 instanceof dog);
    }
}
