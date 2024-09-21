package tasque4;

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