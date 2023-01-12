package org.example.decorator;

import java.io.*;

public class FileData implements Data {

    private File file;

    public FileData(File file) {
        this.file = file;
    }


    @Override
    public void writeData(byte[] array) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(array);
        fileOutputStream.close();
    }

    @Override
    public byte[] readData() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] buffer = fileInputStream.readAllBytes();
        fileInputStream.close();
        return buffer;
    }
}
