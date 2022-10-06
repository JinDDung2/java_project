package week3.day3.file;

import java.io.IOException;

public class ReaFileMain {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("./");

        System.out.println("readOneByte: "+  readFile.readOneByte("a_text.txt"));
        System.out.println("readTwoByte: " + readFile.readTwoByte("textfile.txt"));
        System.out.println("readNByte: " + readFile.readNByte("textfile.txt", 4));
        System.out.println("readLine: " + readFile.readLine("textfile.txt"));
        System.out.println("readAllLine: " + readFile.readAllLine("textfile.txt"));

    /*결과
    readOneByte: H
    readTwoByte: he
    readNByte: hell
    readLine: hello
    readAllLine: helloeveryoneparty
     */
    }
}
