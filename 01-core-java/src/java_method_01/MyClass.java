package java_method_01;

public class MyClass {
    public void printText(String text){
        System.out.println(text);
    }

    public void writeText(String text1, String text2){
        System.out.println(text1);
        System.out.println(text2);
    }

    public int sum(int val1, int val2){
        return val1 + val2;
    }

    public String concat(String val1, String val2) throws IllegalArgumentException{
        if (val1 == null){
            throw new IllegalArgumentException("value1 is null");
        }

        if (val2 == null){
            throw new IllegalArgumentException("value2 is null");
        }
        return val1 + val2;
    }
}
