public class HotDrinksMachine implements VendingMachine {
    public HotDrink getProduct(int name, int volume, int temperature, Long price) {
        if (name == 1) {
            return new Tea(volume, temperature, price);
        } else if (name == 2) {
            return new Coffee(volume, temperature, price);
        } else if (name == 3) {
            return new Cocoa(volume, temperature, price);
        } else {
            System.out.println("Invalid product name");
            return null;
        }
    }
}