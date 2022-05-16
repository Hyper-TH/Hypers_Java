[Youtube Link](https://www.youtube.com/watch?v=5Hk62p9_Mpk) </br>
[Classes sources](https://www.tutorialspoint.com/what-are-the-different-types-of-classes-in-java)
# Classes

- ## Concrete class
<p> 
    Any normal class which does not have any abstract method </br>
    or a class that has an implementation of all the methods </br>
    of its parent class or interface and its own methods is </br>
    a concrete class.
</p>

Example
```java
    public class MyMainProgram
    {
        public static void main(String args[])
        {
            System.out.println("Hi, I am a concrete class!");
        }
    }
```

- ## Abstract class
<p>
    A class declared with abstract keyword and have zero </br>
    or more abstract methods. The abstract classes are </br>
    incomplete classes, therefore to use we strictly need </br>
    to extend the abstract classes to a concrete class </br>
    </br>
    An abstract class, in the context of Java, is a superclass </br>
    that cannot instantiated and is used to state or define general </br>
    characteristics. An object cannot be formed from a Java abstract </br>
    class;  trying to instantiate an abstract class only produces </br>
    a compiler error </br>
</p>

Example
```java
    public abstract class FlyingObject 
    {

        public abstract void takeOff();

        // Abstract methods need to be implemented
        public void land() {
            System.out.println("Landing softly and elegantly");
        }
    }
```

- ## Static class
<p>
    Nested classes, meaning a class is declared within </br>
    another class as a static member
</p>

Example
```java
    public static class Cargo 
    {
        private String type;
        private Integer qty;

        public Cargo(String type, Integer qty) {
            this.type = type;
            this.qty = qty;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getQty() {
            return qty;
        }

        public void setQty(Integer qty) {
            this.qty = qty;
        }

    }
```

### Static Initialization Block
<p>
    static blocks are automatically called as soon as class is loaded in memory </br>
    and there is nothing to do as we have to in case of calling methods and </br>
    constructors inside main() </br>
</p>

Example
```java
    static 
    {
        System.out.println("Static init code .... 1");
    }
```

### Instance Initialization Block
<p>
    Can write code blocks that wouldnt be added to all constructors automatically </br>
    So firstly, constructor is invoked and the java compiler copies the instance </br>
    initializer block in the constructor after the first statement super(). They </br>
    run each time when object of the class is created. </br>
    Initialization blocks are executed whenever the class is initialized and </br>
    before constructors are invoked. </br>
    They are typically placed above the constructors within braces. </br>
    It is not at all necessary to include them in your classes </br>
</p>

Example
```java
    {
        System.out.println("We are initializing an instance of the class 1");
    }

```

- ## Inner class
<p>
    A class declared within another class or method </br>
</p>

Example
```java
    public class Captain 
    {
        private String name;

        public Captain(String name) 
        {
            this.name = name;
        }

        public void giveStatus() {
            System.out.println("Hi my name is " + name + "we have " + crew + "crew members aboard.");
            System.out.println("Enjoy your flight with " + getModel());
        }
    }
```

- ## Enum class
<p>
    An `enum` is a special "class" that represents a group of `constants` </br>
    To create an `enum`, use the `enum` keyword (instead of class or interface) </br>
    and separate the constants witha  comma. Note that they should be in </br>
    uppercase letters
</p>

Example
```java
    public enum SpaceShipType 
    {
        ROUND("wobble wobble"),
        PYRAMID("woaaaam"),
        COOL("I'm cool"),
        FAST("I'm fast"),
        SLOW("I'm slow");

        private String soundWhenFlying = "No sound";

        private SpaceShipType(String soundWhenFlying) {
            this.soundWhenFlying = soundWhenFlying;
        }

        public String getSoundWhenFlying() {
            return soundWhenFlying;
        }

        public void setSoundWhenFlying(String soundWhenFlying) {
            this.soundWhenFlying = soundWhenFlying;
        }
    }
```

- ## Final class
<p>
    A class declared with the `final` keyword and </br>
    it cannot be extended by another class </br>
</p>

Example
```java
    final class BaseClass {
    void Display() {
        System.out.print("This is Display() method of BaseClass.");
    }
    }
    class DerivedClass extends BaseClass { //Compile-time error - can't inherit final class
    void Display() {
        System.out.print("This is Display() method of DerivedClass.");
    }
    }
    public class FinalClassDemo {
    public static void main(String[] arg) {
        DerivedClass d = new DerivedClass();
        d.Display();
    }
    }
```
<p>
In the above example, DerivedClass extends BaseClass(final), we can't extend a final class, </br> 
 so compiler will throw an error. The above program doesn't execute. </br>
</p>

- ## POJO class
<p>
    A class that contains only private variables </br>
    and setter and getter methods to use those variables </br>
    It is a fully encapculsated class </br>
</p>

Example
```java
    class POJO
    {
        private int value = 100;

        public int getValue ()
        {
            return value;
        }
        
        public void setValue (int value)
        {
            this.value=value;
        }
        
        public class Test
        {
            public static void main(String args[])
            {
                POJOp=new POJO();
                System.out.println(p.getValue ());
            }
        }
    }
```


# Functions


# Variables

