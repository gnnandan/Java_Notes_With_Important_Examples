package _15_Multithreading;

//single thread application
class singleThreadExample_class1
{
    public void sq_num() throws InterruptedException
    {
        for(int i=0;i<=5;i++)
        {
            Thread.sleep(2000);
            System.out.println("Square Of Number: "+i*i);
        }
    }
}


//single thread application
class singleThreadExample_class2
{
    public void cub_num() throws InterruptedException
    {
        for(int i=0;i<=5;i++)
        {
            Thread.sleep(2000);
            System.out.println("Cube Of Number: "+i*i*i);
        }
    }
}

public class _1_single_thread_application
{
    public static void main(String[] args) throws InterruptedException
    {
        singleThreadExample_class1 obj1 = new singleThreadExample_class1();
        singleThreadExample_class2 obj2 = new singleThreadExample_class2();

        //single thread 1 application
        System.out.println("Squaring Number Process Started");
        obj1.sq_num();
        System.out.println("Squaring Number Process Finished");

        System.out.println();

        //single thread 2 application
        System.out.println("Cubing Number Process Started");
        obj2.cub_num();
        System.out.println("Cubing Number Process Finished");

    }
}

//output
//Squaring Number Process Started
//Square Of Number: 0
//Square Of Number: 1
//Square Of Number: 4
//Square Of Number: 9
//Square Of Number: 16
//Square Of Number: 25
//Squaring Number Process Finished
//
//Cubing Number Process Started
//Cube Of Number: 0
//Cube Of Number: 1
//Cube Of Number: 8
//Cube Of Number: 27
//Cube Of Number: 64
//Cube Of Number: 125
//Cubing Number Process Finished