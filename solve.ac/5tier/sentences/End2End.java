package sentences;
//Quiz 9086

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class End2End {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            String sent = br.readLine();
            char first = sent.charAt(0);
            char last = sent.charAt(sent.length() - 1);
            bw.write(first);
            bw.write(last);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
