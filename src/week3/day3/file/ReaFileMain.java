package week3.day3.file;

import java.io.IOException;

public class ReaFileMain {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        try {
            System.out.println(readFile.readOneByte("textfile.txt"));
            System.out.println(readFile.readTwoByte("textfile.txt"));
            System.out.println(readFile.readNByte("textfile.txt", 4));
        } catch (IOException e) {
            e.printStackTrace();
        }
    /*결과
        a
        as
        asdf
     */
    }
}
