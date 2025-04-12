package org.Reynard_de_Bosnie.lab2tasque5.lab2tasque5_1;

import java.util.List;

public class Folder implements FileSystemElement{
    public String name;
    private List<FileSystemElement> children;
    public Folder(String name, List<FileSystemElement> children) {
        this.name = name;
        this.children = children;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int acceptSA() {
        int temp = 0;
        for (FileSystemElement child : children) {
            temp += child.acceptSA();
        }
        System.out.println("Total size " + temp);
        return temp;
    }

    @Override
    public boolean acceptVS() {
        boolean temp = true;
        System.out.println("Scanning files...");
        for (FileSystemElement child : children) {
            temp = child.acceptVS();
            if (!temp) {
                System.out.println("Corruption detected");
                return false;
            }
        }
        return temp;
    }
}
