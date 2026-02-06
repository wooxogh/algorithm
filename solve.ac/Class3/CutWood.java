//Quiz 2805

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CutWood {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        long min = Long.parseLong(st.nextToken());
        int max = 0;

        st = new StringTokenizer(br.readLine());
        int[] trees = new int[num];
        for (int i = 0; i < num; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (max < trees[i]) max = trees[i];
        }
    
        int left = 0;
        int right = max;
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            long sum = 0;
            for (int tree : trees) {
                if (tree > mid) sum += (tree - mid);
            }

            if (sum >= min) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
