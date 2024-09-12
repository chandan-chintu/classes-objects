package encapsulationexample;

public class MainEncapsulationClass {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setId(101);
        c1.setName("ABCD");
        c1.setName("PQRS");
        c1.setMobile("+91-73939733893");
        c1.setEmail("abcd@gmail.com");
        System.out.println(c1.getId()+"-----"+c1.getName()+"-----"+c1.getMobile()+"----"+c1.getEmail());

        Customer c2 = new Customer();
        System.out.println(c2.getId()+"-----"+c2.getName()+"-----"+c2.getMobile()+"----"+c2.getEmail());
    }
}
