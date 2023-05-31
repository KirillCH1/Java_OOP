public class Tea extends HotDrink {
    public Tea(int volume, int temperature) {
        super(volume, temperature);
    }

    public void getInfo() {
        System.out.println("Tea\nVolume: " + volume + "\nTemperature: " + temperature);
    }
}