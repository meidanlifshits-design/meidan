package ledsystem;

import java.awt.Color;

import ledsystem.ledssim.Animation;
import ledsystem.ledssim.BlinkingAnimation;
import ledsystem.ledssim.LedController;
import ledsystem.ledssim.RandomAnimationGroup;
import ledsystem.ledssim.SolidAnimation;

public class Main {
    public static void main(String[] args) {
        LedController controller = new LedController(100);

        SolidAnimation magentaAnim = new SolidAnimation(Color.MAGENTA);
        SolidAnimation greenAnim = new SolidAnimation(Color.GREEN);
        SolidAnimation blueAnim = new SolidAnimation(Color.BLUE);
        BlinkingAnimation redBlink = new BlinkingAnimation(Color.RED);

        RandomAnimationGroup mySequence = new RandomAnimationGroup(
                new Animation[] { magentaAnim, greenAnim, blueAnim, redBlink });
        controller.addAnimation(mySequence);
        controller.play();
    }
}
