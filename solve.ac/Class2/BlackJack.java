//Quiz 2798

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int central = Integer.parseInt(st.nextToken());

        int[] cards = new int[num];
        int max = 0;

        for (int i = 0; i < num; i++) {
            cards[i] = Integer.parseInt(st2.nextToken());
        }
        
        for (int i = 0; i < num - 2; i++) {
            for (int j = i + 1; j < num - 1; j++) {
                for (int k = j + 1; k < num; k++) {
                    int comp = cards[i] + cards[j] + cards[k];
                    if ((comp <= central) && (comp > max)) {
                        max = comp;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
