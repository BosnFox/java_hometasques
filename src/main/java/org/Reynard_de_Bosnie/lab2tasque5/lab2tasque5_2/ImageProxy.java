package org.Reynard_de_Bosnie.lab2tasque5.lab2tasque5_2;

class ImageProxy implements IImage {
    private volatile RealImage realImage;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void Display() {
        if (realImage == null) {
            synchronized (this) {
                if (realImage == null) {
                    System.out.println("Proxy loading " + fileName);
                    realImage = new RealImage(fileName);
                }
            }
        }
        realImage.Display();
    }
}
