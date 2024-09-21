package tasque5;

import java.util.ArrayList;

public class Folder extends FileSystemComponent {

    public ArrayList<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void display(int level) {
        for (int i = 0; i < components.size(); i++) {
            for (int j = 0; j < level; j++) {
                System.out.print(" ");
            }
            System.out.println(this.components.get(i).getName() + " (" + this.components.get(i).getSize() + ")");
            if (this.components.get(i) instanceof Folder) {
                if (((Folder) this.components.get(i)).components.size() > 1) {
                    ((Folder) this.components.get(i)).display(level + 1);
                }
            }
        }
    }


    public void add(FileSystemComponent other) {
        this.components.add(other);
    }
    public void remove(FileSystemComponent other) {
        this.components.remove(other);
    }

    @Override
    public int getSize() {
        int result = 0;
        for (int i = 0; i < components.size(); i++) {
            result += components.get(i).getSize();
        }
        return result;
    }
}
