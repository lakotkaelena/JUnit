public class Calculator {
    private static double a;
    private static double b;

    public Calculator() {

    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }

    public static double getDivision(double a, double b) {
        return a / b;
    }

    public static double getMultiplication(double a, double b) {
        return a * b;
    }
}
