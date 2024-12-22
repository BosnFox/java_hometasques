package tasque25;


import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class FileApp {
    public FileApp() {
    }

    public static <FileProcessor> void main(String[] args) throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу или папке: ");
        String path = scanner.nextLine();
        saveToDir(path);
    }

    private static void saveToDir(String path) throws SQLException, IOException {
        try {
            File directory = new File(path);
            final FileDAO fileSaver = new FileDAO();
            if (!directory.exists() || !directory.isDirectory()) {
                throw new IOException("Invalid path");
            }
            File[] files = directory.listFiles();
            if (files == null) {
                throw new IOException("Nothing to save");
            }
            for (File file : files) {
                if (file.isFile() && file.length() < 10 * 1024 * 1024) {
                    fileSaver.saveFile(file);
                }
            }
        } catch (IOException e) {
            System.out.println("Err!: " + e.getMessage());
        }
    }
}