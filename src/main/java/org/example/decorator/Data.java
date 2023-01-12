package org.example.decorator;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Data {
    void writeData(byte[] array) throws IOException;

    byte[] readData() throws IOException;
}
