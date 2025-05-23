package org.Reynard_de_Bosnie.lab2tasque5.lab2tasque5_2;

class RealImage implements IImage {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        load(fileName);
    }

    private void load(String fileName) {
        System.out.println("Loading " + fileName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Held loading " + fileName);
        }
        System.out.println(fileName + " loaded");
    }

    @Override
    public void Display() {
        System.out.println("Displaying " + fileName);
    }
}