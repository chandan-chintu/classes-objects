package interfaceexample;

public interface SampleInterface {

    // all variables are final
    public int someVariable = 123;
    public final int someVariable2 = 234;

    // all methods inside interface are abstarct excpet private, deafult and static

    public abstract void demo1();
    public void demo2();
    void demo3();
    //protected void demo4(); - cannot be used
//    private void demo4(){
//        System.out.println("");
//    }

    default void demo4(){
        System.out.println("demo4 default method");
    }
    default void demo5(){
        System.out.println("demo5 default method");
    }

    static void demo6(){
        System.out.println("demo6 static method");
    }

}
