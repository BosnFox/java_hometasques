package tasque18;

public class Main {
    public static void main(String[] args) {
        tasque18.Pair<String, Integer> pair = new tasque18.Pair<>("Age", 30);
        System.out.println(pair.getFirst()); // Age
        System.out.println(pair.getSecond()); // 30
        pair.setSecond(35);
        System.out.println(pair.getSecond()); // 35
    }
}
