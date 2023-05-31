public class Coffee extends HotDrink {
    public Coffee(int volume, int temperature) {
        super(volume, temperature);
    }

    public void getInfo() {
        System.out.println("Coffee\nVolume: " + volume + "\nTemperature: " + temperature);
    }
}