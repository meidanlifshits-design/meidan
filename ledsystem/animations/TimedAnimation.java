package ledsystem.animations;

import ledsystem.ledssim.LedStrip;

public class TimedAnimation implements Animation{
    private final Animation innerAnimation;
    private final long duration;

    public TimedAnimation(Animation innerAnimation, long duration){
        this.innerAnimation = innerAnimation;
        this.duration = duration;
        if(innerAnimation==null || duration<=0){
            throw new IllegalStateException("time shouldnt be negative or zero, you have to put something in animation");
        }
    }

        @Override
        public void apply(LedStrip strip){
            ledsystem.utils.StopWatch sw = new ledsystem.utils.StopWatch();
            sw.start();
            while(sw.get()<duration){
                innerAnimation.apply(strip);
            }
        }
}
