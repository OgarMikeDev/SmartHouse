public class Chandelier extends LightingDevice {
    public Chandelier(int power) {
        super(power);
    }

    @Override
    public int getEnergyConsumption() {
        return 0;
    }
}
