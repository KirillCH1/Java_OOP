public class MultiplyCalculator extends Calculator {
    public MultiplyCalculator(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double calculate() {
        return getOperand1() * getOperand2();
    }
}