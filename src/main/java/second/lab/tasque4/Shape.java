package second.lab.tasque4;

public class Shape {
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}

class Cube extends Shape {

    private int volume;
    public Cube(int volume) {
        super(volume);
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return this.volume * this.volume * this.volume;
    }
}

class Sphere extends Shape {

    private double volume;
    public Sphere(double volume) {
        super(volume);
        this.volume = volume;
    }
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.volume, 3);
    }
}

class Cylinder extends Shape {

    private double volume;
    private double height;
    public Cylinder (double volume, double height) {
        super(volume);
        this.volume = volume;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(this.volume, 2) * height;
    }
}