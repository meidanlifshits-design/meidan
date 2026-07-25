package ledsystem.ledssim;

import java.util.ArrayList;
import java.util.List;
import ledsystem.animations.Animation;

public class LedController {
    private final LedStrip strip;

    private static class AnimationEntry {
        final Animation animation;

        AnimationEntry(Animation animation) {
            this.animation = animation;
            
        }
    }

    private final List<AnimationEntry> animations;

    public LedController(int stripLength) {
        this.strip = LedSim.createRows(stripLength);
        this.animations = new ArrayList<>();
    }

    public void addAnimation(Animation animation) {
            animations.add(new AnimationEntry(animation));
    }

    public void play() {
        for (AnimationEntry entry : animations) {
                entry.animation.apply(strip);
                
        }
    }
}
