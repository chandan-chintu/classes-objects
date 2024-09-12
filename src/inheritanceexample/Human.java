package inheritanceexample;

public class Human extends Animal{

    public void talk(){
        System.out.println("Human can talk");
    }

    @Override
    public void see() {
        System.out.println("Human can see");
    }

    @Override
    public void smell() {
        System.out.println("Human can smell");
    }

    @Override
    public void breathe() {
        System.out.println("Human can braethe");
    }

    public void legs(){
        System.out.println("Human have legs "+super.legs);
    }
}
