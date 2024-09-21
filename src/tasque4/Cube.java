package tasque4;

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