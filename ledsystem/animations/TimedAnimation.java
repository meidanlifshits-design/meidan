package ledsystem.animations;

import ledsystem.ledssim.LedStrip;

public class TimedAnimation implements Animation{
    private final Animation innerAnimation;
    private final long duration;

    public TimedAnimation(Animation innerAnimation, long duration){
        this.innerAnimation = innerAnimation;
        this.duration = duration;
    }

        @Override
        public void apply(LedStrip strip){
            if(innerAnimation==null || duration<0){
                System.err.println("time shouldnt be negative, you have to put something in animation");
                System.exit(1);
            }
            ledsystem.utils.StopWatch sw = new ledsystem.utils.StopWatch();
            sw.start();
            while(sw.get()<duration){
                innerAnimation.apply(strip);
            }
    }
}
