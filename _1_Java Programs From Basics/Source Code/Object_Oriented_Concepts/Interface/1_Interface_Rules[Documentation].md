## Rules In Interface

1. When a class is implementing the interface **the methods access modifiers should be made as public beacause by default all the abstract method in
interface are public in nature.**

2. If a class implements the interface then it should provide the **body for all the methods present in the interface class**. If the class is not in a position to provide **the body for all the method then class should be made as abstract**.

3. An **object of abstract class can not be created** and An **object of interface cannot be created**.

4. Though we cannot create the object for interface **its reference can be created**.

5. A **class and interface cannot** be related using the **extends keyword**

6. Using the interface ref (parent ref) the implemented methods of a class can be accessed  and using interface ref polymorphism can be achieved

7. Using the interface ref only the **overridden method can be accessed** in order to access the specialized methods **down-casting has to be performed**.

8. A class can be **implemented any number of interface**

9. Note
- If two interface contains **same method signature and same return type** then the implementation class **can provide the body for only one method**.
- If two interface contains **same method name and return type  and change in parameter** then the implementation class should provide the body **for all the methods.**

11. If the implementing class is not able to provide the body for all the methods of interface then **the implementing class should be made as abstract**.
    The **child class of the implementing class can provide the body** for the remaining methods of interface.

12. In interface if the method signature is same and the return type is different from the implementing class can not  provide the body.
    If implementing class provide the body results in ambiguity problem.

13. If the implementing class is not able to provide the body for all the methods of interface then the implementing class should be made as abstract.
    The **child class of the implementing class can provide the body** for the remaining methods of interface.

14. An interface can extend any number of interface.

15. A class implements a interface, the interface extends another interface then the **implementing class should provide the body
    for all the abstract methods in the hierarchy** 

16. An interface **cannot implement another interface.**

17. A **class can extends another class simultaneously it can implement the interface also** in this case the implementing class should extends first, and it
    should implement