//Quiz 10828

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MyStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String Operation = st.nextToken();
            
            switch (Operation) {
                case "push":
                    int k = Integer.parseInt(st.nextToken());
                    intArr.add(k);
                    break;
                case "top":
                    if (intArr.isEmpty()) {
                        System.out.println(-1);
                    } else System.out.println(intArr.get(intArr.size() - 1));
                    break;
                case "size":
                    System.out.println(intArr.size());
                    break;
                case "empty":
                    if (intArr.isEmpty()) {
                        System.out.println(1);
                    } else System.out.println(0);
                    break;
                case "pop":
                    if (intArr.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(intArr.get(intArr.size() - 1));
                        intArr.remove(intArr.size() - 1);
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
