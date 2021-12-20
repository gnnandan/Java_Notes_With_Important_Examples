package Object_Oriented_Concepts.inheritance._1_Points_To_Remember;

class parentClass66
{
    parentClass66()
    {
        //calls first
        System.out.println("This is default constructor of parent class");
    }

    parentClass66(int i, int j)
    {
        this(); //to call the default constructor of same class
        System.out.println("i is: "+i);
        System.out.println("j is: "+j);
    }
}

class childClass66 extends parentClass66
{
    int k,l;
    childClass66(int k,int l)
    {
        super(111,222);//since it is parameterized constructor in parent class 'parentClass66'
        this.k = k;
        this.l = l;
        //        System.out.println("k is: "+k);
        //        System.out.println("l is: "+l);
    }
    void display()
    {
        System.out.println("k is: "+k);
        System.out.println("l is: "+l);
    }
}

public class Note_9
{
    public static void main(String[] args)
    {
        childClass66 c6 = new childClass66(333,444);//since it is parameterized constructor in child class 'childClass66'
        c6.display();
    }
}
