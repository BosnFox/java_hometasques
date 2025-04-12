package org.Reynard_de_Bosnie.tasque4;

public class Main {
    public static void main(String[] args) {
        Container container = new Container(1000);

        Shape cube = new Cube(5);
        Shape sphere = new Sphere(3);
        Shape cyc = new Cylinder(800, 888);

        container.add(sphere);
        container.add(cube);
        container.add(cyc);
    }
}
