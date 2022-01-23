package _6_ArrayListInJava;

import java.util.ArrayList;

public class _1_arrayListSimpleProgram_Example
{
    public static void main(String[] args)
    {

//      Creation Of ArrayList
        ArrayList<String> refVar = new ArrayList<String>(); //Declaration and memory allocation of array list

//      Adding element into the arraylist
        refVar.add("Name: Nandan"); // adding element using "referenceVariable.add()" method
        refVar.add("Age: 22");
        refVar.add("Email: gnnandan7@gmail.com");
        System.out.println("My Data: "+refVar);

        System.out.println();

//      Accessing the arraylist element using "referenceVariable.get()" method
        System.out.println("Accessing a 'Name' element: "+refVar.get(0));

        System.out.println();

//      Modifying the arraylist element using "referenceVariable.set()" method
        System.out.println("Modifying the 'Name' element: "+refVar.set(0,"Nandan GN"));
        System.out.println("My Data: "+refVar);

        System.out.println();

//      Removing the arrayList element using "referenceVariable.remove()" method
        refVar.add("null");
        System.out.println(refVar);
        System.out.println("Removing the 'null' element: "+refVar.remove(3));
        System.out.println(refVar);

        System.out.println();

//      Checking Size Of ArrayList using "referenceVariable.size()" method
        System.out.println("Size of the arraylist is: "+refVar.size());
    }
}
