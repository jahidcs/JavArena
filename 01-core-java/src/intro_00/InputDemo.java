package intro_00;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Enter a Number: ");
        a = scr.nextInt();
        System.out.print("Enter another number: ");
        b = scr.nextInt();

        int result = a + b;
        System.out.println("Addition: " + result);
    }
}
