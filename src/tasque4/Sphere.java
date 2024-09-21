package tasque4;

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