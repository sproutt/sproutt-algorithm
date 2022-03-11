package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon15652 {
    private static int N;
    private static int M;
    private static int[] numbers;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[M];

        dfs(0, 1, sb);
        System.out.println(sb);
    }
    private static void dfs(int depth, int at, StringBuilder sb) {
        if(depth == M) {
            for (int number : numbers) {
                sb.append(number + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = at; i <= N; i++) {
            numbers[depth] = i;
            dfs(depth + 1, i , sb);
        }
    }
}
