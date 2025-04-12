package org.Reynard_de_Bosnie.lab2tasque5.lab2tasque5_1;
import org.Reynard_de_Bosnie.lab2tasque2.lab2tasque2_6.RandomTimer;

public class File implements FileSystemElement{
    private String fileName;
    private int fileSize;
    public File(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public String getName() {
        return fileName;
    }

    @Override
    public boolean acceptVS() {
        boolean isOk = RandomTimer.getTime() < 1001;
        //System.out.println("isok" + isOk);
        System.out.println(isOk ?
                "File " + fileName + " clear" :
                "File " + fileName + " gotten troubles");
        return isOk;
    }
    @Override
    public int acceptSA() {
        System.out.println(this.getName() + " size: " + fileSize);
        return this.fileSize;
    }
}
