package method_overloading_03;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

       int x = c1.performAddition(12, 13);

        System.out.println(x);
    }
}
