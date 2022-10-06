package week3.day3.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    String filePath;

    public ReadFile(String filePath) {
        this.filePath = filePath;
    }

    char readOneByte(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 2024);

        return (char)br.read();
    }

    String readTwoByte(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 2024);
        return (char) br.read() + "" + (char) br.read();
    }
    String readNByte(String filename, int n) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 2024);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += (char) br.read();
        }
        return result;
    }
}
