package ledsystem;

import java.awt.Color;

import ledsystem.ledssim.Animation;
import ledsystem.ledssim.BlinkingAnimation;
import ledsystem.ledssim.GeneralAngelsAnimation;
import ledsystem.ledssim.LedController;
import ledsystem.ledssim.SequentialAnimationGroup;
import ledsystem.ledssim.SolidAnimation;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        LedController controller = new LedController(100);

        SolidAnimation magentaAnim = new SolidAnimation(Color.MAGENTA);
        SolidAnimation greenAnim = new SolidAnimation(Color.GREEN);
        SolidAnimation blueAnim = new SolidAnimation(Color.BLUE);
        GeneralAngelsAnimation angelsAnim = new GeneralAngelsAnimation();
        BlinkingAnimation blinkAnim = new BlinkingAnimation(Color.YELLOW);

        SequentialAnimationGroup mySequence = new SequentialAnimationGroup(
                new Animation[] { magentaAnim, greenAnim, blueAnim, angelsAnim, blinkAnim });

        controller.addAnimation(mySequence, 10.0);
        controller.play();

        long totalRuntime = System.currentTimeMillis() - startTime;
        System.out.println("Program ended. Total runtime: " + totalRuntime + " ms");
    }
}
