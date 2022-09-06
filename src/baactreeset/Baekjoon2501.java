package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon2501 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> results = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if(N % i == 0) {
                results.add(i);
            }
        }

        if (results.size() < K) {
            System.out.println(0);
        } else {
            System.out.println(results.get(K - 1));
        }
    }
}
