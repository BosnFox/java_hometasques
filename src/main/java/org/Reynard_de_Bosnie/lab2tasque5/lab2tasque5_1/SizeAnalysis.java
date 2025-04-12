package org.Reynard_de_Bosnie.lab2tasque5.lab2tasque5_1;

public class SizeAnalysis {
    static void visit(FileSystemElement obj) {
        System.out.println("Size checking " + obj.getName());
        obj.acceptSA();
    }
}
