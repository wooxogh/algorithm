//Quiz 2751

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NumberSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> intArr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            intArr.add(m);
        }

        Collections.sort(intArr);

        StringBuilder sb = new StringBuilder();
        for (int l : intArr) {
            sb.append(l).append('\n');
        }

        System.out.println(sb);
    }
}
