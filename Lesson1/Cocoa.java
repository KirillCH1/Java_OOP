public class Cocoa extends HotDrink {
    public Cocoa(int volume, int temperature) {
        super(volume, temperature);
    }

    public void getInfo() {
        System.out.println("Cocoa\nVolume: " + volume + "\nTemperature: " + temperature);
    }
}