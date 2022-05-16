/*
    ABSTRACT CLASS

    A superclass that cannot be instantiated
    and objects cannot be formed here

Last edit: 16 / 05 / 2022
*/

package space;

// An abstract class, in the context of Java, is a superclass that cannot be instantiated 
// and is used to state or define general characteristics. An object cannot 
// be formed from a Java abstract class;  trying to instantiate an abstract class 
// only produces a compiler error
public abstract class FlyingObject 
{

    public abstract void takeOff();

    // Abstract methods need to be implemented
    public void land() 
    {
        System.out.println("Landing softly and elegantly");
    }
}
