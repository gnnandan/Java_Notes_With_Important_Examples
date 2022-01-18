package Object_Oriented_Concepts._3_Polymorphism;

/**
 * @Note
 * Downcasting - technique to access specialized method
 * Downcasting syntax -  ((child_class_name)(parent_reference_variable)).specialized_method_name();
 * Downcasting example - ((tata)(vb)).proud();
 *
 * Upcasting - technique to access overridden method
 * Upcasting syntax  -  parent_class_name reference_variable = new child_class();
 *--------------------| reference_variable.overriding_method();
 * Upcasting example - vb = new tesla();
 *--------------------|vb.brand();
 */

class vehicle_Brands
{
    void brand()
    {
        System.out.println("Different brand belongs to different countries");
    }
}

class tata extends vehicle_Brands
{
    void brand()
    {
        System.out.println("TATA brand belong to 'INDIA' ");
    }

    void proud()//specialized method
    {
        System.out.println("'TATA IS PROUD INDIAN BRAND'");
    }
}

class mahindra extends vehicle_Brands
{
    void brand()
    {
        System.out.println("MAHINDRA brand belong to 'INDIA' ");
    }

    void proud()//specialized method
    {
        System.out.println("'MAHINDRA IS PROUD INDIAN BRAND'");
    }
}


class tesla extends vehicle_Brands
{
    void brand()
    {
        System.out.println("TESLA brand belong to 'USA' ");
    }
}

class hyundai extends  vehicle_Brands
{
    void brand()
    {
        System.out.println("HYUNDAI brand belong to 'SOUTH KOREA' ");
    }
}


public class _2_upcastingAndDowncasting
{
    public static void main(String[] args)
    {
        vehicle_Brands vb = new vehicle_Brands();

        vb = new tata();
        vb.brand();
        //DOWNCASTING SYNTAX: ((child_ClassName)(referenceVariable_of ParentClass)).specializedMethod()
        ((tata)(vb)).proud(); //DOWNCASTING

        vb = new mahindra();
        vb.brand();
        ((mahindra)(vb)).proud();


        vb = new tesla();
        vb.brand();//UPCASTING
        vb = new hyundai();
        vb.brand();
    }
}
