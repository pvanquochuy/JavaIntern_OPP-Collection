package Abstract.example8;

public class LazyPerson extends Person{
    @Override
    public void eat() {
        System.out.println("Lazy person eats junk food and snacks all day.");
    }

    @Override
    public void exercise() {
        System.out.println("Lazy person avoids exercise and prefers sedentary activities.");
    }
}
