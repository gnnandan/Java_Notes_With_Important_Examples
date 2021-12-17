package Object_Oriented_Concepts.Interface;

interface bank
{
    abstract void rateOfInterest();
}

class sbi implements bank
{
    public void rateOfInterest()
    {
        System.out.println("The SBI bank's interest is 7.5%");
    }
}

class hdbf implements  bank
{
    public void rateOfInterest()
    {
        System.out.println("The HDFC bank's interest is 9.5%");
    }
}
class canara implements  bank
{
    public void rateOfInterest()
    {
        System.out.println("The CANARA bank's interest is 8.5%");
    }
}


// Note here
class combined
{
    //interface class reference
    public void banks(bank b)
    {
        b.rateOfInterest();
    }
}

public class Rule_6
{
    public static void main(String[] args)
    {
        sbi b1 = new sbi();
        hdbf b2 = new hdbf();
        canara b3 = new canara();

        combined c =  new combined();
        c.banks(b1);
        c.banks(b2);
        c.banks(b3);
    }
}
