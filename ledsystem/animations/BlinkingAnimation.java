package ledsystem.animations;

import java.awt.Color;

import ledsystem.ledssim.LedStrip;
import ledsystem.utils.StopWatch;

public class BlinkingAnimation implements Animation {
    private Color activeColor;
    private StopWatch stopWatch;

    public BlinkingAnimation(Color activeColor) {
        this.activeColor = activeColor;
        this.stopWatch = new StopWatch();
        this.stopWatch.start();
    }

    @Override
    public void apply(LedStrip strip) {
        while (true) {
            double elapsed = stopWatch.get();
            if ((int) (elapsed / 2.0) % 2 == 0) {
                strip.setAll(activeColor);
            } else {
                strip.setAll(Color.BLACK);
            }
            strip.apply();
        }
    }
}
