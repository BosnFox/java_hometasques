package tasque5;

public class Main {
    public static void main(String[] args) {
//        // Создаем файлы
        FileSystemComponent file1 = new File("file1.txt", 100);
        FileSystemComponent file2 = new File("file2.txt", 200);
        FileSystemComponent file3 = new File("file3.txt", 300);
//
//        // Создаем папки
        FileSystemComponent folder1 = new Folder("Folder1");
        FileSystemComponent folder2 = new Folder("Folder2");
//
//        // Добавляем файлы в папки
        ((Folder) folder1).add(file1);
        ((Folder) folder1).add(file2);
//
        ((Folder) folder2).add(file3);
        ((Folder) folder2).add(folder1); // Вложенная папка
        ((Folder) folder2).remove(file3);
//
//        // Выводим структуру файловой системы
        ((Folder) folder2).display(0);
//
//        // Выводим общий размер папки 2
        System.out.println("Total size of Folder2: " + folder2.getSize() + " bytes");
    }
}
