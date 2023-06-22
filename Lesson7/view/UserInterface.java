package view;


import model.ComplexNumber;
import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);

    public static void Invitation() {
        System.out.print("Введите действительную часть комплексного числа: ");
        double real = readDouble();

        System.out.print("Введите мнимую часть комплексного числа: ");
        double imaginary = readDouble();

        System.out.print("Введите оператор операции (+, *, /): ");
        String operator = readOperator();

        ComplexNumber number1 = new ComplexNumber(real, imaginary);

        ComplexNumber result = null;

        switch (operator) {
            case "+":
                result = add(number1);
                break;
            case "*":
                result = multiply(number1);
                break;
            case "/":
                result = divide(number1);
                break;
            default:
                System.out.println("Неверный оператор операции.");
                return;
        }

        System.out.println("Результат: " + result.toString());
    }

    private static ComplexNumber add(ComplexNumber number1) {
        System.out.print("Введите действительную часть второго комплексного числа: ");
        double real = readDouble();

        System.out.print("Введите мнимую часть второго комплексного числа: ");
        double imaginary = readDouble();

        ComplexNumber number2 = new ComplexNumber(real, imaginary);

        return number1.add(number2);
    }

    private static ComplexNumber multiply(ComplexNumber number1) {
        System.out.print("Введите действительную часть второго комплексного числа: ");
        double real = readDouble();

        System.out.print("Введите мнимую часть второго комплексного числа: ");
        double imaginary = readDouble();

        ComplexNumber number2 = new ComplexNumber(real, imaginary);

        return number1.multiply(number2);
    }

    private static ComplexNumber divide(ComplexNumber number1) {
        System.out.print("Введите действительную часть второго комплексного числа: ");
        double real = readDouble();

        System.out.print("Введите мнимую часть второго комплексного числа: ");
        double imaginary = readDouble();

        ComplexNumber number2 = new ComplexNumber(real, imaginary);

        return number1.divide(number2);
    }

    private static double readDouble() {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                scanner.nextLine(); // очистка буфера
                System.out.print("Неверный формат числа. Повторите ввод: ");
            }
        }
    }

    private static String readOperator() {
        while (true) {
            String operator = scanner.next();
            if (operator.equals("+") || operator.equals("*") || operator.equals("/")) {
                return operator;
            } else {
                System.out.print("Неверный оператор операции. Повторите ввод: ");
            }
        }
    }
}
