package inheritanceexample;

public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog can bark");
    }

    @Override
    public void see() {
        System.out.println("Dog can see");
    }

    @Override
    public void smell() {
        System.out.println("Dog can smell");
    }

    @Override
    public void breathe() {
        System.out.println("Dog can braethe");
    }
}
