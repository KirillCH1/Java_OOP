public interface VendingMachine {
    HotDrink getProduct(int name, int volume, int temperature, Long price);
}