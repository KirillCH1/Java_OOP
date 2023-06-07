public class Coffee extends HotDrink {
    public Coffee(int volume, int temperature, Long price) {
        super(volume, temperature, price);
    }

    public void getInfo() {
        System.out.println("Coffee\nVolume: " + volume + "\nTemperature: " + temperature + "\nPrice: " + price);
    }
}