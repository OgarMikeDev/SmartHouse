public class Lamp extends LightingDevice {
    public Lamp(int power) {
        super(power);
    }

    @Override
    public int getEnergyConsumption() {
        /*
        brightness - 100
        power - 100
        getEnergyConsumption = 10_000 вт, 10 квт
         */
        return getPower() * getBrightness();
    }
}
