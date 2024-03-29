package by.tms.service;

public class SumOperation implements CalculatorOperation {
    private double num1;
    private double num2;
    private double result;
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public void process() {
        this.result = num1 + num2;
    }

    @Override
    public double getFinalResult() {
        return this.result;
    }

    @Override
    public String toString() {
        return "SumOperation{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", result=" + result +
                '}';
    }
}
