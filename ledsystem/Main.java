package ledsystem;

<<<<<<< HEAD
import ledsystem.ledssim.GeneralAngelsAnimation;
=======
import java.awt.Color;

import ledsystem.animations.Animation;
import ledsystem.animations.BlinkingAnimation;
import ledsystem.animations.TimedAnimation;
>>>>>>> 3dd9d04 (fixed pr4 - final)
import ledsystem.ledssim.LedController;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        LedController controller = new LedController(100);
<<<<<<< HEAD
        BlinkingAnimation blink = new BlinkingAnimation(Color.MAGENTA);
        Animation limitedBlink = new TimedAnimation(blink,8);
=======
        BlinkingAnimation blink = new BlinkingAnimation(Color.RED);
        Animation limitedBlink = new TimedAnimation(blink, 8);
>>>>>>> 3dd9d04 (fixed pr4 - final)
        controller.addAnimation(limitedBlink);
        controller.play();

        long totalRuntime = System.currentTimeMillis() - startTime;
        System.out.println("Program ended. Total runtime: " + totalRuntime + " ms");
    }
}
