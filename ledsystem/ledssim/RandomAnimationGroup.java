package ledsystem.ledssim;

import java.util.Random;

public class RandomAnimationGroup implements Animation {
    private Animation[] animations;

    public RandomAnimationGroup(Animation[] animations) {
        this.animations = animations;

    }

    @Override
    public void apply(LedStrip strip) {
        Random rand = new Random();
        Animation winningAnimation;
        while (true) {
            int index = rand.nextInt(animations.length);
            winningAnimation = animations[index];
            winningAnimation.apply(strip);
            strip.apply();
        }
    }

}