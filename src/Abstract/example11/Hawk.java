package Abstract.example11;

public class Hawk extends Bird{
    @Override
    public void fly() {
        System.out.println("Hawk glides swiftly through the air.");
    }

    @Override
    public void makeSound() {
        System.out.println("Hawk emits a piercing scream.");
    }
}
