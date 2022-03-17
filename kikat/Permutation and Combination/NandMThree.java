package algorithm;

import java.util.Scanner;

public class NandMThree {
    public static int[] arr;
    public static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        arr = new int[m];

        dfs(n, m, 0);
        System.out.println(stringBuilder);
    }

    public static void dfs(int n, int m, int depth) {
        if(m == depth) {
            for(int i : arr) {
                stringBuilder.append(i).append(' ');
            }
            stringBuilder.append('\n');
            return;
        }

        for(int i = 0; i < n; i++) {
            arr[depth] = i + 1;
            dfs(n, m, depth + 1);
        }
    }
}
