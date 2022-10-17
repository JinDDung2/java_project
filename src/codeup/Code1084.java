package codeup;

import java.io.*;

public class Code1084 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] colors = br.readLine().split(" ");
            int cnt = 0;
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 0; i < Integer.valueOf(colors[0]); i++) {
                for (int j = 0; j < Integer.valueOf(colors[1]); j++) {
                    for (int k = 0; k < Integer.valueOf(colors[2]); k++) {
                        bw.write(i + " " + j + " " + k + "\n");
                        cnt++;
                    }
                }
            }
            bw.write(String.valueOf(cnt));
            bw.flush();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

