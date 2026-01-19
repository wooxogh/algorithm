//Quiz 1546

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0;
        int a[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            int comp = Integer.parseInt(st.nextToken());
            a[i] = comp;
            if (comp > max) {
                max = comp;
            }
        }

        double average = 0;
        for (int i = 0; i < n; i++) {
            average += (a[i] / max) * 100;
        }

        System.out.println(average / n);
    }
}
