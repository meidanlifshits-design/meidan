package ledsystem;

import java.awt.Color;

import ledsystem.animations.Animation;
import ledsystem.animations.BlinkingAnimation;
import ledsystem.animations.GeneralAngelsAnimation;
import ledsystem.animations.TimedAnimation;
import ledsystem.ledssim.LedController;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        LedController controller = new LedController(100);
        GeneralAngelsAnimation GeneralAngelsAnimation = new GeneralAngelsAnimation();
        Animation timedGeneralAngelsAnimation = new TimedAnimation(GeneralAngelsAnimation, 8);
        controller.addAnimation(timedGeneralAngelsAnimation);
        controller.play();

        long totalRuntime = System.currentTimeMillis() - startTime;
        System.out.println("Program ended. Total runtime: " + totalRuntime + " ms");
    }
}
