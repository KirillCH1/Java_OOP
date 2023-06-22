package model;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double r = this.real + other.real;
        double i = this.imaginary + other.imaginary;
        return new ComplexNumber(r, i);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double r = this.real - other.real;
        double i = this.imaginary - other.imaginary;
        return new ComplexNumber(r, i);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double r = this.real * other.real - this.imaginary * other.imaginary;
        double i = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(r, i);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double r = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double i = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(r, i);
    }

    public String toString() {
        return "(" + this.real + ", " + this.imaginary + ")";
    }
}