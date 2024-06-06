public class Main {
    public static void main(String[] args) {
        FibonacciCalculator calculator = new FibonacciCalculator();

        System.out.println(calculator.calculate(0));
        System.out.println(calculator.calculate(1));
        System.out.println(calculator.calculate(2));
        System.out.println(calculator.calculate(3));
        System.out.println(calculator.calculate(4));
        System.out.println(calculator.calculate(5));
        System.out.println(calculator.calculate(10));
    }
}
