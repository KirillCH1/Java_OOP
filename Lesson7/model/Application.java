package model;

public class Application {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(-3, 4);

        Calculator calc = Factory.createCalculator("+");
        ComplexNumber sum = calc.calculate(a, b);

        Logger.getInstance().log("Sum: " + sum);

        calc = Factory.createCalculator("*");
        ComplexNumber prod = calc.calculate(a, b);

        Logger.getInstance().log("Product: " + prod);

        calc = Factory.createCalculator("/");
        ComplexNumber div = calc.calculate(a, b);

        Logger.getInstance().log("presenter.Division: " + div);
    }
}