//Quiz 11399

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Atm {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> intSet = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            intSet.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(intSet);

        int result = 0;
        for (int j = 0; j < n; j++) {
            result += intSet.get(j) * (n - j);
        }

        System.out.println(result);
    }
}
