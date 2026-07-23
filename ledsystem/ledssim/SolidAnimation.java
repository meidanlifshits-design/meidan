package ledsystem.ledssim;
import java.awt.Color;


public class SolidAnimation implements Animation {
    private Color color;

    public SolidAnimation(Color color) {
        this.color = color;
    }

    @Override
    public void apply(LedStrip strip) {
        strip.setAll(color);
    }
}
