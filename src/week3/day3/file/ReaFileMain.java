package week3.day3.file;

import java.io.IOException;

public class ReaFileMain {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("./");
            System.out.println(readFile.readOneByte("a_text.txt"));
            System.out.println(readFile.readTwoByte("textfile.txt"));
            System.out.println(readFile.readNByte("textfile.txt", 4));

    /*결과
        a
        as
        asdf
     */
    }
}
