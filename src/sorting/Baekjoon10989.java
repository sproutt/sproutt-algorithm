package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon10989 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] numberCounts = new int[10001];

        for (int i = 0; i < N; i++) {
            numberCounts[Integer.parseInt(br.readLine())] ++;
        }

        br.close();

        for (int i = 1; i < numberCounts.length; i++) {
            while (numberCounts[i] > 0) {
                sb.append(i).append("\n");
                numberCounts[i]--;
            }
        }
        System.out.println(sb);
    }
}
