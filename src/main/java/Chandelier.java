public class Chandelier extends LightingDevice {
    private final int countLamp;
    public Chandelier(int power, int countLamp) {
        super(power);
        this.countLamp = countLamp;
    }
    @Override
    public int getEnergyConsumption() {
        return (getBrightness() * getPower()) * countLamp;
    }
}
