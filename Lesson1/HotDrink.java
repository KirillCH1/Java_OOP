public class HotDrink {
    protected int volume;
    protected int temperature;

    public HotDrink(int volume, int temperature) {
        this.volume = volume;
        this.temperature = temperature;
    }

    public void getInfo() {
        System.out.println("Hot Drink\nVolume: " + volume + "\nTemperature: " + temperature);
    }
}
