package ledsystem;

import java.awt.Color;

import ledsystem.ledssim.BlinkingAnimation;
import ledsystem.ledssim.LedController;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        LedController controller = new LedController(100);

        controller.addAnimation(new BlinkingAnimation(Color.MAGENTA), 5.0);

        controller.play();

        long totalRuntime = System.currentTimeMillis() - startTime;
        System.out.println("Program ended. Total runtime: " + totalRuntime + " ms");
    }
}
