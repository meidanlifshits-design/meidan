package ledsystem.animations;

import java.awt.Color;

import ledsystem.ledssim.LedStrip;

public class GeneralAngelsAnimation implements Animation {

    private static final int[][] LOGO = {
            { 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 1, 1, 1, 0, 0, 0 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
            { 0, 0, 1, 1, 1, 1, 1, 1, 0, 0 },
            { 0, 0, 0, 1, 1, 1, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };

    @Override
    public void apply(LedStrip strip) {

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                int index = row * 10 + col;
                if (index < strip.getLedCount()) {
                    if (LOGO[row][col] == 1) {
                        strip.setLed(Color.WHITE, index);
                    } else {
                        strip.setLed(Color.BLUE, index);
                    }
                }
            }
        }
    }
}
