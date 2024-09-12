package abstractionexample;

public abstract class SimpleAbstarctClass {

    public int abstractVariable =10;

    // abstract methods - methods which does not have a body
    // abstarct class - class contains abstract methods
    public abstract void demo();

    public abstract void demo2();

    // non abstarct method or concrete methods - methods which have a body
    public static void sample(){
        System.out.println("Concrete method inside SimpleAbstarctClass");
    }
}
