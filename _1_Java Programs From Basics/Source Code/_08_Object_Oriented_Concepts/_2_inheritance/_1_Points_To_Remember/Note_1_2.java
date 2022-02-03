package _08_Object_Oriented_Concepts._2_inheritance._1_Points_To_Remember;

/**@Note-1
 * In order to relate two classes we can use extends keyword
 * @Note-2
 * Inheritance promotes  IS- A  relationship
 */

class visitor //parent class or super class
{
    String Visitor_Name= "Nandan";
    int Visitor_phone=123456789;
}

class hospital extends visitor //child class or sub class
{
    void doctor()
    {
        System.out.println("Name: "+Visitor_Name);
        System.out.println("Phone: "+Visitor_phone);
        System.out.println("Tell Me How Can I Help You...!");

    }
}


class Note_1
{
    public static void main(String[] args)
    {
         hospital hospital = new hospital();
         hospital.doctor();
    }
}
