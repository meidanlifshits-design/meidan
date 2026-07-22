package ledsystem.ledssim;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class LedController {
    private final LedStrip strip;
    private final List<Animation> animations;

    public LedController(int stripLength) {
        this.strip = LedSim.createRows(stripLength);
        this.animations = new ArrayList<>();
    }

    public void addAnimation(Animation animation) {
        animations.add(animation);
    }

    public void play() {
        for (Animation animation : animations) {
            animation.apply(strip);
        }
        strip.apply();
    }

    public void setAll(Color color) {
        strip.setAll(color);
    }

    public void setRange(Color color, int start, int end) {
        strip.setRange(color, start, end);
    }

    public void setLed(Color color, int index) {
        strip.setLed(color, index);
    }
}
