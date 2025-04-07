public abstract class LightingDevice {
    public static final int MIN_BRIGHTNESS = 0;
    public static final int MAX_BRIGHTNESS = 100;
    private int brightness;
    private final int power;

    public LightingDevice(int power) {
        this.power = power;
    }

    public void setBrightness(int levelBrightness) {
        if (levelBrightness < MIN_BRIGHTNESS) {
            brightness = MIN_BRIGHTNESS;
        } else if (levelBrightness > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        } else {
            brightness = levelBrightness;
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public int getPower() {
        return power;
    }

    public void changeBrightness(int rate) {
        /*
        brightness - 100 работает устройство.
        rate - -10 пользователь хочет сделать ярче.
        100 - 100%
        x - 10%
        x = 10
         */
        int changed = 0;
        int valuePercent = (brightness * Math.abs(rate)) / 100;
        if (rate < 0) {
            changed = brightness - valuePercent;
        } else if (rate > 0) {
            changed = brightness + valuePercent;
        }
        setBrightness(changed);
    }

    public abstract int getEnergyConsumption();
}
