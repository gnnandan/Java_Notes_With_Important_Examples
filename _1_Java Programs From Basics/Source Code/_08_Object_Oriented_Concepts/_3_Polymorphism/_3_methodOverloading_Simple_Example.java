package _08_Object_Oriented_Concepts._3_Polymorphism;

//parent class
class a
{
    //overloading in same class
    void fun1()
    {
        System.out.println("Parent class method - 1");
    }

    void fun1(int a) //overloaded with Type Of Parameter
    {

        System.out.println("Parent class method - 1: Overloaded with Type Of Parameter, So value of a is: "+a);
    }

    void fun1(int a, float b) //overloaded with Number Of Parameter
    {
        System.out.println("Parent class method - 1: Overloaded with Number Of Parameter, So value of a and b is: "+a+", "+b);
    }

    void fun1(float a, int b) //overloaded with Order Of Parameter
    {
        System.out.println("Parent class method - 1: Overloaded with Order Of Parameter, So value of a and b is: "+a+", "+b);
    }
}

//child class
class b extends a
{
    //overloading fun1 in parent-child class
    void fun1(int a)
    {
        System.out.println("Child class method - 1: Overloading Using Parent - Child Class");
    }
}


public class _3_methodOverloading_Simple_Example
{
    public static void main(String[] args)
    {
        a aClass = new b();
        aClass.fun1();

        //these 1 functions does overload in child class. So it prints child class overloaded values
        aClass.fun1(10);

        //these 2 functions doesn't overload in child class. So it prints parent class overloaded values
        aClass.fun1(10,100.3f);
        aClass.fun1(100.3f,10);
    }
}

//output
//Parent class method - 1
//Child class method - 1: Overloading Using Parent - Child Class
//Parent class method - 1: Overloaded with Number Of Parameter, So value of a and b is: 10, 100.3
//Parent class method - 1: Overloaded with Order Of Parameter, So value of a and b is: 100.3, 10