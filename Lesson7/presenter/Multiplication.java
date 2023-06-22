package presenter;

import model.ComplexNumber;

public class Multiplication implements Operation {
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return a.multiply(b);
    }
}