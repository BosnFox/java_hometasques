package tasque5;

import java.util.ArrayList;

public abstract class FileSystemComponent {

    private String name;
    private int size;
    private ArrayList<FileSystemComponent> components;

    public FileSystemComponent(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }

}

