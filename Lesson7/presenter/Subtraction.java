package presenter;

import model.ComplexNumber;

public class Subtraction implements Operation {

    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return a.subtract(b);
    }
}
