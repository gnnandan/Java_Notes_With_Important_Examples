package _08_Object_Oriented_Concepts._2_inheritance._1_Points_To_Remember;

/**
 * @Note-3
 * Whenever the object of child class is created
 * the memory is allocated for the instance variable of both parent and child class.
 */
class a
{
    String s1 = "I'm in class 'a'"; //parent class 1
}
class b extends a
{
    String s2 = "I'm in class 'b'"; //child class 2
}
public class Note_3
{
    public static void main(String[] args)
    {
        b b_class = new b();
        System.out.println("Accessing the members of parent class 'a': "+b_class.s1);
        System.out.println("Accessing the members of parent class 'b': "+b_class.s2);
    }
}
