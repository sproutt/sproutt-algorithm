package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon2751 {
    private static int N;
    private static ArrayList<Integer> list;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            list.add(n);
        }

        Collections.sort(list);

        for (int value : list) {
            sb.append(value)
              .append('\n');
        }
        System.out.println(sb);
    }
}
