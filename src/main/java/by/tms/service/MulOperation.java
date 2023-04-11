package by.tms.service;

public class MulOperation implements CalculatorOperation {
    private final double num1;
    private final double num2;
    private double result;

    public MulOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void process() {
        this.result = num1 * num2;
    }

    @Override
    public double getFinalResult() {
        return this.result;
    }
}
