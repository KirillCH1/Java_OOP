


/*
 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
    getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в
    программе
 4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
 */



public class Main {
    public static void main(String[] args) {


        // Создание нескольких ГорячихНапитков
        Tea tea = new Tea(250, 70);
        Coffee coffee = new Coffee(150, 90);
        Cocoa cocoa = new Cocoa(200, 80);

        // Создание ГорячихНапитковАвтомата
        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine();

        // Получение продукта из автомата
        HotDrink teaFromMachine = hotDrinksMachine.getProduct(1, 300, 80);
        HotDrink coffeeFromMachine = hotDrinksMachine.getProduct(2, 200, 95);
        HotDrink cocoaFromMachine = hotDrinksMachine.getProduct(3, 150, 85);

        // Вывод информации о продуктах
        tea.getInfo();
        coffee.getInfo();
        cocoa.getInfo();

        teaFromMachine.getInfo();
        coffeeFromMachine.getInfo();
        cocoaFromMachine.getInfo();
    }
}