//Quiz 11866

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Josephus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            intArr.add(i + 1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int idx = 0;
        while (!intArr.isEmpty()) {
            idx = (idx + b - 1) % intArr.size();
            sb.append(intArr.remove(idx));
            if (!intArr.isEmpty()) sb.append(", ");
        }
        sb.append('>');
        System.out.println(sb);
    }
}
