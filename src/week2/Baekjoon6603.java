package week2;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon6603 {
    private static int N;
    private static int[] inputs;
    private static boolean[] isVisits;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            N= scanner.nextInt();
            inputs = new int[N];
            isVisits = new boolean[N];
            if (N == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {
                inputs[i] = scanner.nextInt();
            }
            dfs(0,0);
            sb.append("\n");
        }
        scanner.close();
        System.out.println(sb);

    }
    public static void dfs(int depth, int at) {
        if (depth == 6) {
            for (int i = 0; i < N; i++) {
                if (isVisits[i]) {
                    sb.append(inputs[i]).append(" ");
                }
            }
            sb.append("\n");
            return;
        }

        for (int i = at; i < N; i++) {
            if (!isVisits[i]) {
                isVisits[i] = true;
                dfs(depth + 1, i + 1);
                isVisits[i] = false;
            }
        }
    }
}
