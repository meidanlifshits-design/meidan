package ledsystem.ledssim;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class LedController {
    private final LedStrip strip;

    private static class AnimationEntry {
        final Animation animation;
        final double duration;

        AnimationEntry(Animation animation, double duration) {
            this.animation = animation;
            this.duration = duration;
        }
    }

    private final List<AnimationEntry> animations;

    public LedController(int stripLength) {
        this.strip = LedSim.createRows(stripLength);
        this.animations = new ArrayList<>();
    }

    public void addAnimation(Animation animation, double duration) {
        animations.add(new AnimationEntry(animation, duration));
    }

    public void addAnimation(Animation animation) {
        addAnimation(animation, 1.0); // 1-second default
    }

    public void play() {
        for (AnimationEntry entry : animations) {
            ledsystem.utils.StopWatch sw = new ledsystem.utils.StopWatch();
            sw.start();
            while (sw.get() < entry.duration) {
                entry.animation.apply(strip);
                strip.apply();
            }
        }
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
