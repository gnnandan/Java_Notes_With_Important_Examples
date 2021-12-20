package Object_Oriented_Concepts.inheritance._3_Important_Keywords_And_Methods;

/**
 * @Note
 * this keyword: it will always point the currently executing object.
 */

class parentClass22 //parent class
{
    int i, j; //instance variable declaration
    parentClass22() //constrictor
    {
        System.out.println("This is default constructor");
    }
}

class childClass22 extends parentClass22 //child class
{
    childClass22()
    {
        super(); // which calls the constructor of parent class
    }

    void display(int i, int j)
    {
        this.i = i;//this points the executing object.
        this.j = j;
        System.out.println("i is: "+i);
        System.out.println("j is: "+j);
    }
}


public class this_keyword
{
    public static void main(String[] args)
    {
        childClass22 c2 = new childClass22();
        c2.display(111,222);
    }
}
