package org.example.assignment3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new AdapterPCtoCalculator();
        calculator.playGame();
        calculator.playVideo();
    }
}
