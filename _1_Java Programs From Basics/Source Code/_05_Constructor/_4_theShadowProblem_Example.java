package _05_Constructor;

import java.util.Scanner;

class shadowProblemEx
{
    /*
        shadow problem occurs when the instance variable and local variable are of same name
        at that time the compiler gives full preference for local variable
     */

    private int studentId;
    private String studentName;
    public void setData(int studentId, String studentName)
    {
        //shadow problem causing here
        studentId = studentId;
        studentName= studentName;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public String getStudentName()
    {
        return studentName;
    }
}

public class _4_theShadowProblem_Example
{
    public static void main(String[] args)
    {
        shadowProblemEx ex = new shadowProblemEx();
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the name: ");
        String s_name = scanner.next();
        System.out.print("Enter the id: ");
        int s_id = scanner.nextInt();
        ex.setData(s_id,s_name);

        System.out.println("Name: "+ex.getStudentName());
        System.out.println("Id: "+ex.getStudentId());
    }
}
