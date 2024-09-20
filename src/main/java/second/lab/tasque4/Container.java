package second.lab.tasque4;

public class Container {
    private double volume;

    public Container(double volume) {
        this.volume = volume;
    }

    public void add(Shape form) {
        if (this.volume >= form.getVolume()) {
            this.volume = this.volume - form.getVolume();
            System.out.println("Success, volume left: " + this.volume);
        } else {
            System.out.println("Not enough space");
        }
    }
}
