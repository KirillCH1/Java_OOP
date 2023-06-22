package model;

import presenter.*;

public class Factory {
    public static Calculator createCalculator(String operation) {
        Operation op;
        switch (operation) {
            case "+":
                op = new Addition();
                break;
            case "-":
                op = new Subtraction();
                break;
            case "*":
                op = new Multiplication();
                break;
            case "/":
                op = new Division();
                break;
            default:
                op = null;
        }
        return new Calculator(op);
    }
}