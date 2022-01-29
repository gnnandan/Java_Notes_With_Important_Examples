package _04_Functions._3_Getters_And_Setters;

import java.util.Scanner;

public class _2_setters_getters_Ex2
{
    public static void main(String[] args)
    {
        data d = new data();
        Scanner info = new Scanner(System.in);


        System.out.print("Enter the Student name: ");
        String Name = info.next();
        System.out.print("Enter the Student usn: ");
        String No =  info.next();

        d.setData(Name,No);

        System.out.println("Name is: "+d.getData_sname());
        System.out.println("USN is "+d.getData_sno());
    }
}

class data
{
    private String sname;
    private String sno;

    void setData(String Student_Name, String Student_USN)
    {
        sname = Student_Name;
        sno = Student_USN;
    }

    String getData_sname()
    {
        return sname;
    }
    String getData_sno()
    {
        return  sno;
    }
}
