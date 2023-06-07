public class Cocoa extends HotDrink {
    public Cocoa(int volume, int temperature, Long price) {
        super(volume, temperature, price);
    }

    public void getInfo() {
        System.out.println("Cocoa\nVolume: " + volume + "\nTemperature: " + temperature + "\nPrice: " + price);
    }
}