package org.example.decorator;

import java.io.IOException;

public class DataDecorator implements Data {
    Data data;

    public DataDecorator(Data data) {
        this.data = data;
    }

    @Override
    public void writeData(byte[] array) throws IOException {
        data.writeData(array);
    }

    @Override
    public byte[] readData() throws IOException {
        return data.readData();
    }
}
