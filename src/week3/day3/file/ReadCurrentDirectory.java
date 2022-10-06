package week3.day3.file;

import java.io.File;

public class ReadCurrentDirectory {
    public static void main(String[] args) {
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);

                    /*/a_text
                    ./out
                    ./java-project.iml
                    ./textfile
                    ./.gitignore
                    ./.git
                    ./.idea
                    ./src*/
        }
    }
}
