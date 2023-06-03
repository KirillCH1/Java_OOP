
/*
    Написать калькулятор в ООП стиле(инкапсуляция, наследование, полиморфизм)
*/


public class Main {
    public static void main(String[] args) {

        // Сложение двух чисел
        AddCalculator addCalculator = new AddCalculator(10, 20);
        double result = addCalculator.calculate();
        System.out.println(result);
        // Результат: 30.0


        // Вычетание двух чисел
        SubtractCalculator subtractCalculator = new SubtractCalculator(20, 10);
        result = subtractCalculator.calculate();
        System.out.println(result);
        // Результат: 10.0


        // Умножение двух чисел
        MultiplyCalculator multiplyCalculator = new MultiplyCalculator(10, 20);
        result = multiplyCalculator.calculate();
        System.out.println(result);
        // Результат: 200.0


        // Деление двух чисел
        DivideCalculator divideCalculator = new DivideCalculator(20, 10);
        result = divideCalculator.calculate();
        System.out.println(result);
        // Результат: 2.0
    }
}