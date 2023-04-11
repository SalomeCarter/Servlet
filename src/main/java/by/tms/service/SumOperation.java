package by.tms.service;

public class SumOperation implements CalculatorOperation {
    private double num1;
    private double num2;
    private double result;

    public SumOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

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

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public void process() {
        this.result = num1 + num2;
    }

    @Override
    public double getFinalResult() {
        return this.getResult();
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
