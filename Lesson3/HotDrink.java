public class HotDrink implements Comparable<HotDrink> {
    protected int volume;
    protected int temperature;
    protected Long price;

    public HotDrink(int volume, int temperature, Long price) {
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }

    public void getInfo() {
        System.out.println("Hot Drink\nVolume: " + volume + "\nTemperature: " + temperature + "\nPrice: " + price);
    }

    public int compareTo(HotDrink drink) {
        return this.price.compareTo(drink.price);
    }
}

