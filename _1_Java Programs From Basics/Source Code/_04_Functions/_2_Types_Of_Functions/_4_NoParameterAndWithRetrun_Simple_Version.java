package _04_Functions._2_Types_Of_Functions;

public class _4_NoParameterAndWithRetrun_Simple_Version
{
    public static void main(String[] args)
    {
        //Variable should create to store for same returning datatype value
        String storeStr  = func(); //function with return type
        System.out.println(storeStr);
    }

    static String func() //no parameter //returning "String value"
    {
        String s = "Returning String Data";

        return s; //return type string used
    }
}

//output
//Returning String Data