//Quiz 1764

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Unknown {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<String> arrStr = new ArrayList<>();
        for (int i = 0; i < n + m; i++) {
            arrStr.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            String comp = arrStr.get(j);
        }
    }
}
