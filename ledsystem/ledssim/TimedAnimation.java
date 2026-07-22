package ledsystem.ledssim;

import ledsystem.utils.StopWatch;

public class TimedAnimation implements Animation {
    private final Animation animation;
    private final StopWatch stopWatch;
    private final double duration;

    public TimedAnimation(Animation animation, double duration) {
        this.animation = animation;
        this.duration = duration;
        this.stopWatch = new StopWatch();
        this.stopWatch.start();
    }

    @Override
    public void apply(LedStrip strip) {
        if (stopWatch.get() < duration) {
            animation.apply(strip);
        }
    }
}
