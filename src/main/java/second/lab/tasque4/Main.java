package second.lab.tasque4;

public class Main {
    public static void main(String[] args) {
        Container container = new Container(1000);

        Shape cube = new Cube(5);
        Shape sphere = new Sphere(3);

        container.add(sphere);
        container.add(cube);
    }
}
