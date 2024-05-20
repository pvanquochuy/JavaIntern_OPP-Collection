package Abstract.example4;

public class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and sometimes hunts in water.");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps in a den.");
    }
}
