package _12_Data_Structures_In_Java.OOPS_DS_Implementation;

import java.util.Arrays;
import java.util.Scanner;

class algorithm
{
    private static String[] empName;
    private static int top;

    static class stack
    {
        private int size;
        stack(int size)
        {
            empName = new String[size];
            this.size=size;
            top = 0;
        }
        public void addEmp(String newEmp)
        {
            if(isFull())
            {
                System.out.println("Database is full not able to insert");
                System.exit(1);
            }
            else
            {
                empName[top++] = newEmp; //adding element
            }
        }

        //Specialized method
        public boolean isFull()
        {
            return top==size;
        }

        public void displayEmp()
        {
            for(int i=0;i<top;i++)
            {
                System.out.println(empName[i]);
            }
        }
    }

    static class sortEmp
    {
        public void sortEmp()
        {
            for(int i=0;i< empName.length-1;i++)
            {
                for(int j=0;j< empName.length-i-1;j++)
                {
                    if(empName[j].compareTo(empName[j+1])>0)
                    {
                        String temp = empName[j];
                        empName[j] = empName[j+1];
                        empName[j+1] = temp;
                    }
                }
            }

            System.out.println("Sorted order of employees: "+Arrays.toString(empName));


            Scanner searchEmp = new Scanner(System.in); //TODO -> issue not able to compare the values mean the string name
            System.out.print("Enter the employee name to find: ");
            String searching = searchEmp.next();

            int position = search("Nandan");

//            System.out.println("The Employee name:"+search+" found at id: "+position);

            if(position==-1)
            {
                System.out.println("The employee name: "+searching+" not found in the database");
            }
            else
            {
                System.out.println("The Employee name:"+searching+" found at id: "+position);
            }
        }

        static int search(String find)
        {
            //binary search: Search Person
            int mid;
            int low =0;
            int high = empName.length-1;

            while(low<=high)
            {
                mid = low+(high-low)/2;

                if(empName[mid]==find)
                {
                    return mid;
                }
                else if(empName[mid].compareTo(find)>0)
                {
                    high = mid-1;

                }
                else
                {
                    low = mid+1;
                }
            }
            return -1;
        }

    }
}
public class Stacks_Sorting_Search_Algorithm
{
    public static void main(String[] args)
    {
        stackOperation();
        sortEmployees();
    }

    static void stackOperation()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees to insert: ");
        int size = scanner.nextInt();

        algorithm.stack stack = new algorithm.stack(size);
//        for(int i=0;i<size;i++)
//        {
//            System.out.print("Enter the employee id: "+i+": ");
//            String name = scanner.next();
//            stack.addEmp(name);
//        }
        stack.addEmp("Nandan");
        stack.addEmp("Yashas");
        stack.addEmp("Ganesh");

        //stack.displayEmp();
    }

    static void sortEmployees()
    {
        algorithm.sortEmp sort = new algorithm.sortEmp();
        sort.sortEmp();
    }
}
