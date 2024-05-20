package Polymorphism.example2;

public class Bicycle extends Vehicle{
    @Override
    public void speedUp() {
        System.out.println("Pedaling faster on the bicycle.");
        super.speedUp();
    }
}
