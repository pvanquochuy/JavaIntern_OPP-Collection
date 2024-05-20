package Abstract.example9;

public class Glockenspiel extends Instrument{
    @Override
    public void play() {
        System.out.println("Glockenspiel plays melodious tunes.");
    }

    @Override
    public void tune() {
        System.out.println("Glockenspiel is tuned by adjusting the metal bars.");
    }
}
