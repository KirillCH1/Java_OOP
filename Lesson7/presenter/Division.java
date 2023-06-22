package presenter;

import model.ComplexNumber;

public class Division implements Operation {
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return a.divide(b);
    }
}