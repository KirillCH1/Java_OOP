package presenter;

import model.ComplexNumber;

public class Addition implements Operation {
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return a.add(b);
    }
}