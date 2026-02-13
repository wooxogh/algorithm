//Quiz 11053

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Longest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] lis = new int[T];
        int size = 0;

        for(int i = 0; i < T; i++){
            int pos = Arrays.binarySearch(lis, 0, size, arr[i]);

            if(pos < 0) pos = -(pos + 1);
            
            lis[pos] = arr[i];
            
            if(pos == size) size++;
        }

        System.out.println(size);
    }
}
