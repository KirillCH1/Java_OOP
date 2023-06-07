public class Tea extends HotDrink {
    public Tea(int volume, int temperature, Long price) {
        super(volume, temperature, price);
    }

    public void getInfo() {
        System.out.println("Tea\nVolume: " + volume + "\nTemperature: " + temperature + "\nPrice: " + price);
    }
}