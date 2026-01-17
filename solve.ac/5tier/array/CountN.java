//Quiz 10807
package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CountN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < a; i++) {
            int comp = Integer.parseInt(st.nextToken());
            if (comp == b) {
                result += 1;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
