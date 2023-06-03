public class DivideCalculator extends Calculator {
    public DivideCalculator(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double calculate() {
        if (getOperand2() == 0) {
            throw new IllegalArgumentException("Деление на ноль");
        }
        return getOperand1() / getOperand2();
    }
}