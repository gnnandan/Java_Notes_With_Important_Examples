package _08_Object_Oriented_Concepts._5_Interface;

import java.util.Scanner;

/** @interface_class */
abstract class test
{
    public abstract void abstractFunction(); //abstract method without body/implementation


}

interface calculate
{
    //Note - _5_Interface methods are always abstract and its access modifier is always public
    public abstract  void add();
}

class interfaceEx implements calculate
{
    public void add()
    {
        int a;
        int b;
        int sum;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a= scanner.nextInt();
        System.out.print("Enter b: ");
        b= scanner.nextInt();

        sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
    }
}

public class _1_interfaceEx1
{
    public static void main(String[] args)
    {
        interfaceEx ex = new interfaceEx();
        ex.add();
    }
}
