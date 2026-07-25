package ledsystem.ledssim;

import java.util.ArrayList;
import java.util.List;
import ledsystem.animations.Animation;

public class LedController {
    private final LedStrip strip;
    


    private final List<Animation> animations;

    public LedController(int stripLength) {
        this.strip = LedSim.createRows(stripLength);
        this.animations = new ArrayList<>();
    }

    public void addAnimation(Animation animation) {
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
                
        }
    }
}
