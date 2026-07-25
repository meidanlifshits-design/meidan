package ledsystem;

import java.awt.Color;

import ledsystem.animations.BlinkingAnimation;
import ledsystem.animations.SolidAnimation;
import ledsystem.ledssim.LedController;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Initialize the LED controller with a row layout strip
        LedController controller = new LedController(100);

        // Add an animation to the controller
        controller.addAnimation(new SolidAnimation(Color.BLUE));
        // Play the animation
        controller.play();

        long totalRuntime = System.currentTimeMillis() - startTime;
        System.out.println("Program ended. Total runtime: " + totalRuntime + " ms");
    }
}