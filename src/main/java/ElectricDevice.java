public interface ElectricDevice {
    boolean isSwitched();

    void switchOn();

    void switchOff();

    int getEnergyConsumption();

    default void toggle() {
        if (isSwitched()) {
            switchOff();
        } else {
            switchOn();
        }
    }
}
