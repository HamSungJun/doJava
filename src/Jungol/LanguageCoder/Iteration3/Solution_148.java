package Jungol.LanguageCoder.Iteration3;

import java.io.*;

public class Solution_148 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                bw.write("# ");
            }

            for (int j = N; j > i; j--) {
                bw.write("  ");
            }

            bw.newLine();

        }

        for (int i = N; i > 1; i--) {

            for (int j = N; j >= i; j--) {
                bw.write("  ");
            }

            for (int j = 1; j < i; j++) {
                bw.write("# ");
            }

            bw.newLine();

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
