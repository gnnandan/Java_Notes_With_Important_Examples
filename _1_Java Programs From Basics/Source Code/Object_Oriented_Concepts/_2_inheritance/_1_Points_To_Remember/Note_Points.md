- **1.  In order to relate two classes we can use extends keywords.**

    ```java
    class visitor
    {
    	String name;			// parent class or super class
    	int ph_no;
    }
    
    class Hospital extends visitor		
    {
    	void Doctor_conslut()			// child class or sub class
    	{
    		------------
    			-------------
    			------------
    	}
    }
    ```

- **2.  Inheritance promotes  IS- A  relationship.**

    ```java
    class visitor
    {
    	String name;			// parent class or super class
    	int ph_no;
    }
    
    class Hospital extends visitor		
    {
    	void Doctor_conslut()			// child class or sub class
    	{
    		------------
    			-------------
    			------------
    	}
    }
    ```

- **3.  Whenever the object of child class is created the memory is allocated for the instance variable of both parent and child class.**

    ```java
    package _1Java_Codes_From_Basics._15inheritanceInJava;
    
    //parent class or super class 
    class a
    {
        String s1 = "I'm in class 'a'"; //parent class 1
    }
    class b extends a
    {
        String s2 = "I'm in class 'b'"; //parent class 2
    }
    
    //child class
    public class _1InheritanceEx1 extends b
    {
        public static void main(String[] args)
        {
            b b_class = new b();
            _1InheritanceEx1 inex = new _1InheritanceEx1();
            System.out.println("Accessing the members of parent class 'a': "+b_class.s1); 
            System.out.println("Accessing the members of parent class 'b': "+b_class.s2);
            /* System.out.println(inex.s1);
            System.out.println(inex.s2);*/
        }
    }
    //output
    Accessing the members of parent class 'a': I'm in class 'a'
    Accessing the members of parent class 'b': I'm in class 'b'
    ```

- **4.  Private members will not participate in the inheritance. This rule is made to promote ENCAPSULATION.**

    ```java
    package _1Java_Codes_From_Basics._15inheritanceInJava;
    
    class class1
    {
        private String ns1 = "I'm in class 'a'"; //parent class 1
    }
    class class2 extends class1
    {
        String ns2 = "I'm in class 'b'"; //parent class 2
    }
    public class _2Note_4_inheritanceEx2
    {
        public static void main(String[] args)
        {
            class2 class_2 = new class2();
            _2Note_4_inheritanceEx2 inex1 = new _2Note_4_inheritanceEx2();
            //System.out.println(class_2.ns1);//private members can't able to access
            System.out.println(class_2.ns2);
        }
    }
    //output
    I'm in class 'b'
    ```

- **5.  Child class can call the instance method of parent class directly.**

    ```java
    package _1Java_Codes_From_Basics._15inheritanceInJava;
    
    class parentClass1
    {
        void func1()
        {
            System.out.println("Inside parent class 1");
        }
    }
    class parentClass2 extends  parentClass1
    {
        void func2()
        {
            System.out.println("Inside parent class 2");
        }
    }
    public class _3Note_5_inheritanceEx3
    {
        public static void main(String[] args)
        {
            //create a instance where ever extends is happening
            parentClass2 p2 = new parentClass2();
            System.out.println("Calling members(_4_functions) from child class");
            p2.func1();
            p2.func2();
        }
    }
    //output
    Calling members(_4_functions) from child class
    Inside parent class 1
    Inside parent class 2
    ```

- **6.  The child class can call the inherited static methods directly.**

    ```java
    package _1Java_Codes_From_Basics._15inheritanceInJava;
    
    class parentClass_1
    {
        static void func_1()
        {
            System.out.println("Inside static method/function of 'parentClass_1' ");
        }
    }
    class parentClass_11 extends  parentClass_1
    {
        void func_11()
        {
            System.out.println("Inside user defined function of 'parentClass_11'");
        }
    }
    public class _4Note_6_inheritanceEx4
    {
        public static void main(String[] args)
        {
            parentClass_11 p11 = new parentClass_11();
            parentClass_1.func_1(); //calling static method/function of parent class 
            p11.func_11(); //calling user defined method/function of parent class
        }
    }
    //output
    Inside static method/function of 'parentClass_1' 
    Inside user defined function of 'parentClass_11'
    ```

- **7. Unlike the private members constructors are also doesn't participate in the inheritance.**
    - for 'default constructor'

    ```java
    package _1Java_Codes_From_Basics._15inheritanceInJava;
    
    class parentClass_2
    {
        int i;
        int j;
        parentClass_2()
        {
            super();
            i=111;
            j=222;
        }
    }
    class parentClass_22 extends parentClass_2
    {
        parentClass_22()
        {
            super();
        }
        void display()
        {
            System.out.println("'i' is: "+i);
            System.out.println("'j' is: "+j);
        }
    }
    
    public class _5Note_7_inheritanceEx5
    {
        public static void main(String[] args)
        {
            //constructor won't participate in _2_inheritance 
            parentClass_22 p22 = new parentClass_22();
            p22.display();
        }
    }
    //output
    'i' is: 111
    'j' is: 222
    ```

    - for 'parameterized constructor'

    ```java
    package _1Java_Codes_From_Basics._15inheritanceInJava;
    
    class parentClass_2
    {
        int i;
        int j;
    //    parentClass_2()  //for 'default constructor'
    //    {
    //        super();
    //        i=111;
    //        j=222;
    //        System.out.println("'x' is: "+x);
    //    }
        parentClass_2(int x) //for parameterized constructor
        {
            super();
            i=111;
            j=222;
            System.out.println("'x' is: "+x);
        }
    }
    class parentClass_22 extends parentClass_2
    {
        parentClass_22()
        {
    //        super() //to call default constructor of parentClass_2
            super(1000);//to call parameterized constructor of parentClass_2 and passing the parameter value
        }
        void display()
        {
            System.out.println("'i' is: "+i);
            System.out.println("'j' is: "+j);
        }
    }
    
    public class _5Note_7_inheritanceEx5
    {
        public static void main(String[] args)
        {
            //constructor won't participate in _2_inheritance
            parentClass_22 p22 = new parentClass_22();
            p22.display();
        }
    }
    //output
    'x' is: 1000
    'i' is: 111
    'j' is: 222
    ```

- **8. Even though the parameterized constructor of a sub-class is called yet, the default constructor in the super class is executed first then the parameterized constructor of the sub-class is executed.**

    ```java
    package _1Java_Codes_From_Basics._15inheritanceInJava;
    
    class parentClass_3
    {
        int i;
        int j;
        parentClass_3() //for parameterized constructor
        {
            super();
            System.out.println("This is default constructor");
        }
    }
    class parentClass_33 extends parentClass_3
    {
        parentClass_33(int i, int j)
        {
            super();//to call default constructor of parentClass_3
    
            // to point the variable we use this (solves shadow problem)
            this.i =i;
            this.j =j;
        }
        void displays()
        {
            System.out.println("'i' is: "+i);
            System.out.println("'j' is: "+j);
        }
    }
    
    public class _6Note_8_inheritanceEx6
    {
        public static void main(String[] args)
        {
            parentClass_33 p33 = new parentClass_33(111,222); //since it is a parameterized constructor in 'parentClass_22. So we need to pass value'
            p33.displays();
        }
    }
    //output
    This is default constructor
    'i' is: 111
    'j' is: 222
    ```

- **9. If the parameterized constructor of the super class has to be executed then parameter super should be used in the sub-class**

    ```java
    package _1Java_Codes_From_Basics._15inheritanceInJava;
    
    class parentClass_3
    {
        int i;
        int j;
        parentClass_3() //for parameterized constructor
        {
            super();
            System.out.println("This is default constructor");
        }
    }
    class parentClass_33 extends parentClass_3
    {
        parentClass_33(int i, int j)
        {
            super();//to call default constructor of parentClass_3
    
            // to point the variable we use this (solves shadow problem)
            this.i =i;
            this.j =j;
        }
        void displays()
        {
            System.out.println("'i' is: "+i);
            System.out.println("'j' is: "+j);
        }
    }
    
    public class _6Note_8_inheritanceEx6
    {
        public static void main(String[] args)
        {
            parentClass_33 p33 = new parentClass_33(111,222); //since it is a parameterized constructor in 'parentClass_22. So we need to pass value'
            p33.displays();
        }
    }
    //output
    This is default constructor
    'i' is: 111
    'j' is: 222
    ```