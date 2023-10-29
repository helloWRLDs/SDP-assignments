package org.example.assignment3;

public class AdapterPCtoCalculator extends Computer implements Calculator {
    @Override
    public void playVideo() {
        playVideoOnPC();
    }

    @Override
    public void playGame() {
        playGameOnPC();
    }
}
