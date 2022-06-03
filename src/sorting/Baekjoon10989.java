package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon10989 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] counters = new int[10001];

        for (int i = 0; i < N; i++) {
            counters[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 0; i < counters.length; i++) {
            while (counters[i] > 0) {
                sb.append(i)
                  .append("\n");
                counters[i]--;
            }
        }
        System.out.println(sb);
    }
}
