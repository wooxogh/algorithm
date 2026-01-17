package array;
//Quiz 2675

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Characters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int rep = Integer.parseInt(st.nextToken());
            String cha = st.nextToken();

            for (int j = 0; j < cha.length(); j++) {
                char target = cha.charAt(j);
                for (int k = 0; k < rep; k++) {
                    bw.write(target);
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
