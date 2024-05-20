package Abstract.example4;

public class Lion extends Animal{
    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps during the day.");
    }
}
