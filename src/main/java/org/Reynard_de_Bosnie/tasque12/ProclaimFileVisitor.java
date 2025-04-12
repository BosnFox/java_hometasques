package org.Reynard_de_Bosnie.tasque12;

import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class ProclaimFileVisitor<Path> implements FileVisitor<Path> {
    private int count = 0;
    private int total = 0;
    public ProclaimFileVisitor() {
    }
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        typeSpace();
        System.out.println(getName(file.toString()) + ", " +
                (file.toString().endsWith(".txt") ? getText(file.toString()) : 0) + " words");
        return FileVisitResult.CONTINUE;
    }

    public void getTotal() {
        typeSpace();
        System.out.println("So far in total: " + this.total);
    }

    private int getText(String file) throws IOException {
        try(FileReader reader = new FileReader(file)) {
            BufferedReader czytaty = new BufferedReader(reader);
            int count = 0;
            String line;
            while ((line = czytaty.readLine()) != null) {
                String[] split = line.split(" ");
                count += split.length;
            }
            this.total += count;
            return count;
        }
        catch (IOException ex) {
            System.out.println("el dia del payaso");
            return 0;
        }
    }

    private String getName(String file) {
        String[] split = file.split("\\\\");
        return split[split.length - 1];
    }

    private void typeSpace() {
        for (int i = 0; i < this.count; i++) {
            System.out.print(" ");
        }
    }

    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        typeSpace();
        System.out.println("directory " + getName(dir.toString()));
        this.count += 1;
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        this.count -= 1;
        getTotal();
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Something is off about " + file.toString());
        return FileVisitResult.CONTINUE;
    }
}
