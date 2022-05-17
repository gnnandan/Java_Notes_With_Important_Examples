package _15_Multithreading;

class myThread1 implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread 1 Started");
        System.out.println("Thread 1 is running");
        System.out.println("Thread 1 Finished");
    }
}

class myThread2 implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread 2 Started");
        System.out.println("Thread 2 is running");
        System.out.println("Thread 2 Finished");
    }
}

public class _3_multithreading_creating_threads_by_using_runnable_interface
{
    public static void main(String[] args)
    {
        myThread1 thread1 = new myThread1();
        myThread2 thread2 = new myThread2();

        Thread obj1 = new Thread(thread1);
        Thread obj2 = new Thread(thread2);
        obj1.start();
        obj2.start();
    }
}

//output
//Thread 1 Started
//Thread 2 Started
//Thread 2 is running
//Thread 2 Finished
//Thread 1 is running
//Thread 1 Finished