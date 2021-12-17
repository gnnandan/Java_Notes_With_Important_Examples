package Object_Oriented_Concepts.Interface;

interface data1
{
    abstract void person(String name, int age);
}

interface data2
{
    abstract void person(String branch, String email);
}

class colab implements data1,data2
{
    //method name is same but parameter is different so there is two body of function
    public void person(String name, int age)
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public void person(String branch, String email)
    {
        System.out.println("Branch: "+branch);
        System.out.println("Email: "+email);
    }
}

public class Rule_10
{
    public static void main(String[] args)
    {
        colab colab = new colab();
        colab.person("Nandan",22);
        colab.person("CSE","gnnandan7@gmail.com");
    }
}
