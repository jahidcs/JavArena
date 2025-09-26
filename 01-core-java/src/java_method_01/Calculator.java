package java_method_01;
import java.util.Scanner;

public class Calculator {
    int performAddition(int a, int b){
        int result = a + b;
        return result;
    }

    int performSubtraction(int a, int b){
        int result = a - b;
        return result;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter a number: ");
        int x = scr.nextInt();

        System.out.println("Enter another number: ");
        int y = scr.nextInt();

        int add = calc.performAddition(x, y);
        int sub = calc.performSubtraction(x, y);

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
    }
}
