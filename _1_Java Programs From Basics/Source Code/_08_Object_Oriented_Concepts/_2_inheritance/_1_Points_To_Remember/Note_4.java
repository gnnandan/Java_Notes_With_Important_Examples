package _08_Object_Oriented_Concepts._2_inheritance._1_Points_To_Remember;

/**
 * @Note-4
 * Private members will not participate in the _2_inheritance. This rule is made to promote ENCAPSULATION
 */
class class1
{
    private String ns1 = "I'm in class 'a'"; //parent class 1
}
class class2 extends class1
{
    String ns2 = "I'm in class 'b'"; //parent class 2
}

public class Note_4
{
    public static void main(String[] args)
    {
        class2 class2 =  new class2();
        //System.out.println(class2.ns1);//private members can't able to access
        System.out.println(class2.ns2);
    }
}
