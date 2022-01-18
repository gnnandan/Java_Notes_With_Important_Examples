package Object_Oriented_Concepts._5_Interface;

interface data
{
    //interface methods by default public in nature, and also it should be abstract method
    // the access modifiers and abstract method and access modifiers of variable is automatically added by java compiler
    public abstract void myData();
}

class info implements data
{
    public void myData()
    {
        String Name, Email, Branch;
        Name = "Nandan G N";
        Email = "gnnandan7@gmail.com";
        Branch = "Computer Science";
        System.out.println("Name: "+Name);
        System.out.println("Branch: "+Branch);
        System.out.println("Email: "+Email);
    }
}


public class Rule_1
{
    public static void main(String[] args)
    {
        info info_Object = new info();
        info_Object.myData();
    }
}
