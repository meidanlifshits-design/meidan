package ledsystem.ledssim;

public class SequentialAnimationGroup implements Animation {
    private Animation[] animations;

    public SequentialAnimationGroup(Animation[] animations) {
        this.animations = animations;
    }

    @Override
    public void apply(LedStrip strip) {
        for (Animation animation : animations) {
            animation.apply(strip);
        }
    }
}