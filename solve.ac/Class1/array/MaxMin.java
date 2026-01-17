//Quiz 10818

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int init = Integer.parseInt(st.nextToken());
        int max = init;
        int min = init;

        for (int i = 0; i < a - 1; i++) {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            int comp = Integer.parseInt(st.nextToken());
            if (comp > max) max = comp;
            if (comp < min) min = comp;
        }
        
        System.out.println(min + " " + max);
    }
}
