package _05_Constructor;

import java.util.Scanner;

/**
 * @Note
 * this-keyword:
 *  - it is used to resolve the shadow problem(instance variable and local variable are of same names)
 *  - this-keyword always points the current execution object
 *  - at that time the compiler gives full preference for local variable
 */

class thisKeywordExample
{
    private String name;
    private int id;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        //shadow problem solution
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        //shadow problem solution
        this.id = id;
    }
}

public class _4_theShadowProblemSolution_Using_this_keyword_Example
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        int id;

        System.out.print("Enter your name: ");
        name = input.next();

        System.out.print("Enter your id: ");
        id= input.nextInt();

        thisKeywordExample example = new thisKeywordExample();
        example.setName(name);
        example.setId(id);

        System.out.println("Name is: "+example.getName());
        System.out.println("Id is: "+example.getId());
    }
}
