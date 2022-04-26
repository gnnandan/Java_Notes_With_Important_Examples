package _12_Multithreading;

class MyThread1 extends Thread
{
    public void run()
    {
        try
        {
            for (int i=0;i<5;i++)
            {
                Thread.sleep(2000);
                System.out.println("double_num: "+(i^2));
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Something went wrong");
        }

    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        try
        {
            for (int i=0;i<5;i++)
            {
                Thread.sleep(2000);
                System.out.println("cube_num: "+(i*i*i));
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Something went wrong");
        }
    }
}
public class _2_multithreading_creating_threads_by_extending_thread_class
{
    public static void main(String[] args)
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

        //running thread
        t1.run();
        t2.run();

    }
}
//output
//cube_num: 0
//double_num: 2
//double_num: 2
//double_num: 3
//cube_num: 1
//double_num: 3
//double_num: 0
//double_num: 0
//cube_num: 8
//double_num: 1
//cube_num: 27
//double_num: 1
//cube_num: 64
//double_num: 6
//double_num: 6
//cube_num: 0
//cube_num: 1
//cube_num: 8
//cube_num: 27
//cube_num: 64
