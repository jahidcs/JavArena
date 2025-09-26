package method_overloading;

public class Calculator {
    int performAddition(int a, int b) {
        int result = a + b;
        return result;
    }

    int performAddition(int a, int b, int c, int d) {
        int result = a + b + c + d;
        return result;
    }

    float performAddition(float a, float b) {
        float result = a + b;
        return result;
    }

    double performAddition(double a, double b) {
        double result = a + b;
        return result;
    }
}