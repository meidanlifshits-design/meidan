package ledsystem;

import ledsystem.ledssim.GeneralAngelsAnimation;
import ledsystem.ledssim.LedController;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        LedController controller = new LedController(100);
        BlinkingAnimation blink = new BlinkingAnimation(Color.MAGENTA);
        Animation limitedBlink = new TimedAnimation(blink,8);
        controller.addAnimation(limitedBlink);
        controller.play();

        long totalRuntime = System.currentTimeMillis() - startTime;
        System.out.println("Program ended. Total runtime: " + totalRuntime + " ms");
    }
}
