package polymorphismexample;

public class MainPolymorphismClass {
    public static void main(String[] args) {
        Drawing d1 = new Drawing();
        d1.draw();
        d1.draw(123);
        d1.draw(2.34);
        d1.draw(12,34);
    }
}
