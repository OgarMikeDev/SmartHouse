public class Main {
    public static void main(String[] args) {
        LightingDevice lamp = new Lamp(100);
        System.out.println("Лампа: ");
        System.out.println("Нажимаем на переключатель прибора!");
        lamp.toggle();
        System.out.println("Яркость в %: " + lamp.getBrightness());
        System.out.println("Энергопотребление в вт: " + lamp.getEnergyConsumption());
        System.out.println("Делаем яркость в 2 раза меньше!");
        lamp.changeBrightness(-50);
        System.out.println("Яркость в %: " + lamp.getBrightness());
        System.out.println("Энергопотребление в вт: " + lamp.getEnergyConsumption());

        LightingDevice chandelier = new Chandelier(100, 4);
        System.out.println("\nЛюстра:");
        System.out.println("Нажимаем на переключатель прибора!");
        chandelier.toggle();
        System.out.println("Яркость в %: " + chandelier.getBrightness());
        System.out.println("Энергопотребление в вт: " + chandelier.getEnergyConsumption());
        System.out.println("Делаем яркость в 2 раза меньше!");
        chandelier.changeBrightness(-50);
        System.out.println("Яркость в %: " + chandelier.getBrightness());
        System.out.println("Энергопотребление в вт: " + chandelier.getEnergyConsumption());
    }
}
