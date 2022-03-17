package algorithm;

import java.util.Scanner;

public class NandMOne {

    static boolean[] isVisited;
    static int[] arr;
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        isVisited = new boolean[n];
        arr = new int[m];

        dfs(n,m, 0);

        System.out.println(stringBuilder);
    }

    public static void dfs(int n, int m, int depth) {
        if(depth == m) {
            for(int i : arr) {
                stringBuilder.append(i).append(' ');
            }
            stringBuilder.append('\n');
            return;
        }

        for(int i = 0; i < n; i++) {
            if(!isVisited[i]) {
                isVisited[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1);
                isVisited[i] = false;
            }
        }
    }
}
