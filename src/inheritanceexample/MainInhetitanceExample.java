package inheritanceexample;

public class MainInhetitanceExample {
    public static void main(String[] args) {
        System.out.println("Parent Animal class");
        Animal animal = new Animal();
        animal.see();
        animal.smell();
        animal.breathe();

        System.out.println("Child Human class");
        Human human = new Human();
        human.talk();
        human.see();
        human.smell();
        human.breathe();
        human.legs();

        System.out.println("Child Dog class");
        Dog dog = new Dog();
        dog.bark();
        dog.see();
        dog.smell();
        dog.breathe();
    }
}
