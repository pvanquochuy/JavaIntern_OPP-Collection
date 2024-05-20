package Abstract.example9;

public class Violin extends Instrument{
    @Override
    public void play() {
        System.out.println("Violin produces rich and vibrant tones.");
    }

    @Override
    public void tune() {
        System.out.println("Violin is tuned by adjusting the tension of the strings.");
    }
}
