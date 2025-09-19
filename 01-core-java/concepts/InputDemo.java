import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scr.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your age: ");
        int age = scr.nextInt();
        System.out.println("You are " + age + " years old.");

        scr.close();
    }
}
