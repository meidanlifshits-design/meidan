package ledsystem.animations;

import ledsystem.ledssim.LedStrip;

public class TimedAnimation implements Animation{
    private final Animation innerAnimation;
    private final long duration;

    public TimedAnimation(Animation innerAnimation, long duration){
        this.innerAnimation = innerAnimation;
        this.duration = duration;
<<<<<<< HEAD
        if(innerAnimation==null || duration<=0){
            throw new IllegalStateException("time shouldnt be negative or zero, you have to put something in animation");
        }
=======
>>>>>>> 3dd9d04 (fixed pr4 - final)
    }

        @Override
        public void apply(LedStrip strip){
<<<<<<< HEAD
=======
            if(innerAnimation==null || duration<0){
                System.err.println("time shouldnt be negative, you have to put something in animation");
                System.exit(1);
            }
>>>>>>> 3dd9d04 (fixed pr4 - final)
            ledsystem.utils.StopWatch sw = new ledsystem.utils.StopWatch();
            sw.start();
            while(sw.get()<duration){
                innerAnimation.apply(strip);
            }
<<<<<<< HEAD
        }
=======
    }
>>>>>>> 3dd9d04 (fixed pr4 - final)
}
