package ledsystem;

import ledsystem.ledssim.Animation;
import ledsystem.ledssim.FlashAnimation;
import ledsystem.ledssim.LedController;
import ledsystem.ledssim.TimedAnimation;
import ledsystem.utils.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch runtime = new StopWatch();
        runtime.start();

        StopWatch loopTimer = new StopWatch();
        loopTimer.start();

        // Initialize the LED controller with a row layout strip
        LedController controller = new LedController(100);

        // Add a flash animation that toggles blue/magenta every 2 seconds, limited to 4.5 seconds.
        Animation flash = new FlashAnimation();
        TimedAnimation timedFlash = new TimedAnimation(flash, 10);
        controller.addAnimation(timedFlash);
        // Play the animation continuously so timed effects can update.
        while (loopTimer.get() < 10.0) {
            controller.play();
        }

        System.out.println("Program ended. Total runtime: " + runtime.get() + " s");
    }
}