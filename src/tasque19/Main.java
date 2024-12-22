package tasque19;

public class Main {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] intArray = {3, 5, 7, 2, 9, 1};
        Integer maxInt = findMax(intArray);
        System.out.println("Максимальный Integer: " + maxInt); // Вывод: 9
    }
}
