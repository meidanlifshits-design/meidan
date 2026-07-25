package ledsystem.ledssim;

import java.util.ArrayList;
import java.util.List;
import ledsystem.animations.Animation;

public class LedController {
    private final LedStrip strip;
    

<<<<<<< HEAD

    private final List<Animation> animations;
=======
    private static class AnimationEntry {
        final Animation animation;

        AnimationEntry(Animation animation) {
            this.animation = animation;
            
        }
    }

    private final List<AnimationEntry> animations;
>>>>>>> 3dd9d04 (fixed pr4 - final)

    public LedController(int stripLength) {
        this.strip = LedSim.createRows(stripLength);
        this.animations = new ArrayList<>();
    }

    public void addAnimation(Animation animation) {
<<<<<<< HEAD
        if (animation!=null){
            animations.add(animation);
        }
        else{
            throw new IllegalStateException("you have to put an animation to add");
        }
    }

    public void play() {
        for (Animation animation : animations) {
                animation.apply(strip);
=======
            animations.add(new AnimationEntry(animation));
    }

    public void play() {
        for (AnimationEntry entry : animations) {
                entry.animation.apply(strip);
>>>>>>> 3dd9d04 (fixed pr4 - final)
                
        }
    }
}
