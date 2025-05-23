package org.Reynard_de_Bosnie.lab2tasque5.lab2tasque5_2;

public class Main {
    public static void main(String[] args) {
        IImage image1 = new ImageProxy("photo1.jpg");
        image1.Display();
        System.out.println("L1");
        image1.Display();
        System.out.println("L1R");
        IImage image2 = new ImageProxy("photo2.jpg");
        image2.Display();
        System.out.println("L2");
        IImage image11 = new ImageProxy("photo1.jpg");
        image11.Display();
        System.out.println("LR1");
    }
}
