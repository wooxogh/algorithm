//Quiz 1991

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TreeTraversal {
    static int[][] tree = new int[26][2];
    static StringBuilder sb = new StringBuilder();

    static void preorder(int node) {
        if (node == -1) return;
        sb.append((char) (node + 'A'));
        preorder(tree[node][0]);
        preorder(tree[node][1]);
    }

    static void inorder(int node) {
        if (node == -1) return;
        inorder(tree[node][0]);
        sb.append((char) (node + 'A'));
        inorder(tree[node][1]);
    }

    static void postorder(int node) {
        if (node == -1) return;
        postorder(tree[node][0]);
        postorder(tree[node][1]);
        sb.append((char) (node + 'A'));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char p = st.nextToken().charAt(0);
            char n1 = st.nextToken().charAt(0);
            char n2 = st.nextToken().charAt(0);

            tree[p - 'A'][0] = (n1 == '.') ? -1 : n1 - 'A';
            tree[p - 'A'][1] = (n2 == '.') ? -1 : n2 - 'A';
        }

        preorder(0);
        sb.append('\n');
        inorder(0);
        sb.append('\n');
        postorder(0);
        System.out.println(sb);
    }
}
