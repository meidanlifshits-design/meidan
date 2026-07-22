package ledsystem.ledssim;

import java.awt.Color;
import ledsystem.utils.StopWatch;

public class FlashAnimation implements Animation {
    private final StopWatch stopWatch;
    private boolean showBlue;

    public FlashAnimation() {
        this.stopWatch = new StopWatch();
        this.showBlue = true;
        this.stopWatch.start();
    }

    @Override
    public void apply(LedStrip strip) {
        if (stopWatch.get() >= 2.0) {
            showBlue = !showBlue;
            stopWatch.start();
        }

        strip.setAll(showBlue ? Color.BLUE : Color.MAGENTA);
    }
}
