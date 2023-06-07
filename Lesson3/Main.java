


/*
   Добавить к торговому аппарату с горячими напитками Comparable(сортировку по ценам, цены должны быть типа Long)
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

// Создание нескольких ГорячихНапитков
        Tea tea = new Tea(250, 70, 50L);
        Coffee coffee = new Coffee(150, 90, 70L);
        Cocoa cocoa = new Cocoa(200, 80, 60L);

        // Создание ГорячихНапитковАвтомата
        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine();

        // Получение продукта из автомата
        HotDrink teaFromMachine = hotDrinksMachine.getProduct(1, 300, 80, 50L);
        HotDrink coffeeFromMachine = hotDrinksMachine.getProduct(2, 200, 95, 70L);
        HotDrink cocoaFromMachine = hotDrinksMachine.getProduct(3, 150, 85, 60L);

        // Вывод информации о продуктах
        tea.getInfo();
        coffee.getInfo();
        cocoa.getInfo();

        teaFromMachine.getInfo();
        coffeeFromMachine.getInfo();
        cocoaFromMachine.getInfo();

        // Сортировка по ценам
        List<HotDrink> drinks = new ArrayList<>();
        drinks.add(tea);
        drinks.add(coffee);
        drinks.add(cocoa);
        drinks.add((HotDrink) teaFromMachine);
        drinks.add((HotDrink) coffeeFromMachine);
        drinks.add((HotDrink) cocoaFromMachine);

        Collections.sort(drinks);

        System.out.println("Sorted drinks by price:");
        for (HotDrink drink : drinks) {
            drink.getInfo();
        }
    }
}