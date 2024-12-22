package tasque23;

public class Main {
    public static <T> void printType(T obj) {
        System.out.println(obj.getClass().toString());
    }
    public static void main(String[] args) {
        printType(123); // java.lang.Integer
        printType("Hello"); // java.lang.String
    }
}
