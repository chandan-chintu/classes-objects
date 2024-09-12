package interfaceexample;

public class SampleImplentation implements SampleInterface{
    @Override
    public void demo1() {
        System.out.println("Demo1 implemtation inside SampleImplentation");
    }

    @Override
    public void demo2() {
        System.out.println("Demo2 implemtation inside SampleImplentation");
    }

    @Override
    public void demo3() {
        System.out.println("Demo3 implemtation inside SampleImplentation");
    }

    @Override
    public void demo4() {
        SampleInterface.super.demo4();
    }
}
