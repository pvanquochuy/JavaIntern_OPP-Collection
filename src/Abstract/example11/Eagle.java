package Abstract.example11;

public class Eagle extends Bird{
    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle screeches loudly.");
    }
}
