# Introduction To Java

# Table Of Content

## Introduction

- Java is developed by **sun microsystem in 1995** and it is designed by **James Gosling**
- Java is **Object Oriented Programming Language** which is popular because it is **easy to use, reliable and portable.**
- **Compile once and run anywhere** is a feature in java where we can compile the code and run in any OS and this benefits is achieved by **JVM(Java Virtual Machine)**

## Execution of Java(.java) file

![3.png](C:\Users\NANDANGN\Desktop\Learning Resources\Java Notes With Important Examples\Resources\Images\ExecutionOfJavaProgram.png)

- We write code in java with extension **.java** this .java is converted into **.class(Bytecode)** by **Java Compiler.**
- Then this **.class(Bytecode)** is converted into **.obj** by **Java Interpreter**
- After conversions we give **.obj** file for **microprocessor for execution of machine instruction.**

## Java Environment

![Image](C:\Users\NANDANGN\Desktop\Learning Resources\Java Notes With Important Examples\Resources\Images\Java_Environment.drawio.png)

## Java Features

To show the nature of java programming language, JAVA has provided the following features.

```
FEATURES
--------------------------
1.Simple
2.Object Oriented
3.Platform independent
4.Arch Nuetral
5.Portable
6.Robust
7.Secure
8.Dynamic
9.Distributed
10.Multi Threadded
11.Interpretive
12.High Performance
```

<aside>
💡 **Language Fundamentals:**
----------------------
1. Variables/identifiers
2. Reserved keywords
3. Datatypes
4. literals
5. pillars of object orientations

</aside>

## Java Data Types

- A Datatype specify 3 things
    1. What value the Data Type can take
    2. How many bytes that it occupy.
    3. What are the different operation that we can perform on it. 
- In Java Data types are classified into 2 types
    - **Primitive Data Type / Value Type**
        - These data types created only on **STACK**
        - Integer ex:1234 always gets created on **STACK**
        - Again **Primitive Data Type is classified into 2 types**
            1. **Predefined** - these data types is provided by java 
                - Types
                    - Characters
                    - Integer
                    - Booleans
                    - Reals
            2. **Userdefined** - these data types is user choice, the user can create what he likes 
                - Types
                    - Enumerations
    - **Non Primitive Data Type / Reference Type**
        - These data types created only on **HEAP**
        - String ex: Quest always gets created on
        - Again Non **Primitive Data Type is classified into 2 types**
        1. **Predefined** - these data types is provided by java 
            - Types
                - Objects
                - Strings
        2. **Userdefined** - these data types is user choice, the user can create what he likes 
            - Types
                - Class
                - Array
                - Interfaces

    ![Untitled](C:\Users\NANDANGN\Desktop\Learning Resources\Java Notes With Important Examples\Resources\Images\Datatypes.png)
            
- A document on Data types and their usage
    
    <aside>
    🗒️ Data Types:
    ---------------
    Java is strictly a typed programming language, where in java applicatins before representing data
    first we have to confirm which type of data we representing. In this context, to represent type of
    data we have to use "data types".
    
    EX:
    i = 10;        ----> invalid, no data type representation.
    int i=10;	  --> Valid, type is represented then data is rpersented.
    In java applications , data types are able to provide the following advatages.
    
    1. We are able to identify memory sizes to store data.
         EX: int i=10;--> int will provide 4 bytes of memory to store 10 value.
    
    2. We are able to identify range values to the variable to assign.
    EX: byte b=130;---> Invalid
    byte b=125;    ---> Valid
    
    Reason: 'byte' data type is providing a particular range for its variables like -128 to 127, in
    this range only we have to assign values to byte variables.
    
    To prepare java applications, JAVA has provided the following data types.
    --------------------------------------------------------------------------
    1. Primitive Data Types / Primary Data types
    2. Non-primitive datatypes / secondary data types
    
    1. Numeric Data Types
    ----------------------
    1. Integral data types/ Integer Data types:
    --------------------------------------------
    byte ------> 1 			bytes ----> 0
    short------> 2 			bytes ----> 0
    int--------> 4 			bytes ----> 0
    long-------> 8 	        bytes ----> 0
    
    2. Non-Integral Data Types:
    ---------------------------
    float------> 4 bytes ---> 0.0f
    double-----> 8 bytes ---> 0.0
    
    1. Non-Numeric Data types:
    ---------------------------
    char ---------> 2 bytes---> ' ' [single space]
    boolean-------> 1 bit-----> false
    
    2. User defined data types / Secondary Data types
    ---------------------------------------------------
    All classes, all abstract classes, all interfaces, all arrays,......
    No fixed memory allocation for User defined data types
    If we want to identify range values for variables on the basis of data types then we have to use the
    following formula.
    n-1 n-1
    -2 to 2 - 1
    Where 'n' is no of bits.
    
    EX: Data Type: byte , size= 1 byte = 8 bits.
    8-1 8-1
    -2 to 2 - 1
    7 7
    -2 to 2 - 1
    -128 to 128 - 1
    -128 to 127
    
    Note: This formula is applicable upto Integral data types, not applicable for other data types.
    To identify "min value" and "max value" for each and every data type, JAVA has provided the
    following two constant variables from all the wrapper classes.
    MIN_VALUE and MAX_VALUE
    Note: Classes representation of primitive data types are called as Wrapper Classes
    
    Primitive data types Wrapper Classes
    -------------------- ----------------
    byte --------------------> java.lang.Byte
    short -------------------> java.lang.Short
    int ---------------------> java.lang.Integer
    long --------------------> java.lang.Long
    float -------------------> java.lang.Float
    double-------------------> java.lang.Double
    char---------------------> java.lang.Character
    boolean------------------> java.lang.Boolean
    
    </aside>
    

## Java Keywords

- Keywords are the words which is **already explained by the java compiler**
- Keywords are the reserved words it should not use as a variable/identifier name.
    
    ```java
    Reserved Keyword:
    ------------------
    In java some identifiers are reserved. Hence to associate some data and these words can not be considered as identifiers in general programs.
    
    Reserved keyword[53]
    	-->Actual RK [3]	--> true,false,null
    keywords
    	-->used keywords[48]
    	-->unused keywords[3]	-->goto,const
    
    used keywords:
    --------------
    Reserved keywords_for datatypes:
    ---------------------------------
    	1.byte
    	2.short
    	3.int
    	4.float
    	5.double
    	6.char
    	7.long
    	8.boolean
    
    Reserved keywords_for flow control:
    -----------------------------------
    	1.if
    	2.else
    	3.switch
    	4.case
    	5.default
    	6.for
    	7.do
    	8.while
    	9.break
    	10.continue
    	11.return
    
    #Reserved keywords_for modifiers:
    --------------------------------
    	1.public
    	2.private
    	3.protected
    	4.static
    	5.final
    	6.abstract
    	7.synchronized
    	8.native
    	9.strictfp
    	10.transient
    	11.volatile
    
    Reserved keywords_for exception handling:
    ------------------------------------------
    	1.try
    	2.catch
    	3.finally
    	4.throw
    	5.throws
    	6.assert
    
    Reserved keywords_for  classes:
    -----------------------------
    	1.class
    	2.package
    	3.import
    	4.extends
    	5.implements
    	6.interface
    
    Reserved keywords_for classes:
    -----------------------------
    	1.new
    	2.instanceOf
    	3.super
    	4.this
    
    abstract	-->abstract class and methods
    *enum		-->for grouped constants
    void		-->return type
    ```
    
- Reserved keywords and its one line explanation
    
    <aside>
    💡 List of all Java Keywords
    --------------------------
    Keywords or Reserved words are the words in a language that are used for **some internal process or represent some predefined actions**. These words are therefore not allowed to use as a variable names or objects. Doing this will result into a compile time error.
    
    Java also contains a list of reserved words or keywords. These are:
    --------------------------------------------------------------------
    1.  abstract ****- Specifies that a class or method will be implemented later, in a subclass
    
    2.  assert - Assert describes a predicate (a true–false statement) placed in a Java program to indicate that the developer thinks that the predicate is always true at that place. If an assertion evaluates to false at run-time, an assertion failure results, which typically causes execution to abort.
    
    3.  boolean – A data type that can hold True and False values only
    
    4.  break – A control statement for breaking out of loops
    
    5.  byte – A data type that can hold 8-bit data values
    
    6.  case – Used in switch statements to mark blocks of text
    
    7.  catch – Catches exceptions generated by try statements
    
    8.  char – A data type that can hold unsigned 16-bit Unicode characters
    
    9.  class -Declares a new class
    
    10. continue -Sends control back outside a loop
    
    11. default -Specifies the default block of code in a switch statement
    
    12. do -Starts a do-while loop
    
    13. double – A data type that can hold 64-bit floating-point numbers
    
    14. else – Indicates alternative branches in an if statement
    
    15. enum – A Java keyword used to declare an enumerated type. Enumerations extend the baseclass.
    
    16. extends -Indicates that a class is derived from another class or interface
    
    17. final -Indicates that a variable holds a constant value or that a method will not be overridden
    
    18. finally -Indicates a block of code in a try-catch structure that will always be executed
    
    19. float -A data type that holds a 32-bit floating-point number
    
    20. for -Used to start a for loop
    
    21. if -Tests a true/false expression and branches accordingly
    
    22. implements -Specifies that a class implements an interface
    
    23. import -References other classes
    
    24. instanceof - Indicates whether an object is an instance of a specific class or implements an interface
    
    25. int – A data type that can hold a 32-bit signed integer
    
    26. interface – Declares an interface
    
    27. long – A data type that holds a 64-bit integer
    
    28. native -Specifies that a method is implemented with native (platform-specific) code
    
    29. new – Creates new objects
    
    30. null -Indicates that a reference does not refer to anything
    
    31. package – Declares a Java package
    
    32. private -An access specifier indicating that a method or variable may be accessed only in the class it’s declared in
    
    33. protected – An access specifier indicating that a method or variable may only be accessed in the class it’s declared in (or a subclass of the class it’s declared in or other classes in the same package)
    
    34. public – An access specifier used for classes, interfaces, methods, and variables indicating that an item is accessible throughout the application (or where the class that defines it is accessible)
    
    35. return -Sends control and possibly a return value back from a called method
    
    36. short – A data type that can hold a 16-bit integer
    
    37. static -Indicates that a variable or method is a class method (rather than being limited to one particular object)
    
    38. strictfp – A Java keyword used to restrict the precision and rounding of floating point calculations to ensure portability.
    
    39. super – Refers to a class’s base class (used in a method or class constructor)
    
    40. switch - A statement that executes code based on a _Assignment_Series.Live_Test.findingMinimalElement value
    
    41. synchronized -Specifies critical sections or methods in multithreaded code
    
    42. this -Refers to the current object in a method or constructor
    
    43. throw – Creates an exception
    
    44. throws -Indicates what exceptions may be thrown by a method
    
    45. transient -Specifies that a variable is not part of an object’s persistent state
    
    46. try -Starts a block of code that will be tested for exceptions
    
    47. void -Specifies that a method does not have a return value
    
    48. volatile -Indicates that a variable may change asynchronously
    
    49. while -Starts a while loop
    
    ** The keywords const and goto are reserved, even they are not currently in use.
    
        const -Reserved for future use
        goto – Reserved for future use
    
    ** true, false and null look like keywords, but in actual they are literals. However they still can’t be used as identifiers in a program.
    
    </aside>
    

## Java Variables

- The values can be changed (not fixed).
- Some times it is called as **identifiers.**
    - 📝**See Here!**
        
        ```java
        int x=10;
        int virat=18;
        
        /*
        int	--> datatype
        x 	--> identifier/variable
        =	--> operator
        10	--> data(constant)/literal
        ;	--> terminator
        */
        ```
        
- **RULES:**
    1. A variable name is the combination of 1 to 31 characters.
        - 📝Note This
            
            ```
            1. a to z
            2. A to Z
            3. 0-9
            4. _
            5. $
            
            note: If we are using any other character we will get compile time error
            ```
            
    2. it should start with a character or a underscore.
        - 📝Note This
            
            ```
            ex: virat18	-->(valid)
            	  18virat	-->(invalid)
            ```
            
    3. keywords is not allowed as a variable name.
    4. Java is case sensitive in case of identifiers it will threat the name as new one..!
        - 📝Note This
            
            ```
            int virat=18;
            int VIRAT=19;
            int Virat=20;
            ```
            
    5. There is no length limit for java identifiers but it just recommended that in and around 15 characters are sufficient.
    6. no commas, space is allowed in between.
    7. no special symbol is allowed except underscore.
    8. Identifiers should not be duplicated with in the same scope, identifiers may be duplicated in two different scopes.
    9. In java applications, we can use all predefined class names and interface names as identifiers.

[Introduction Part Codes](https://www.notion.so/Introduction-Part-Codes-ae22139cbea04640bc90b1699fb98798)