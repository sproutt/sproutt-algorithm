package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon9095 {
    private static int sum = 0;
    private static int count = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            count = 0;
            dfs(n, 0);
            sb.append(count + "\n");
        }
        System.out.println(sb);
    }


    private static void dfs(int target, int n) {
        if(target < n) {
            return;
        }
        if(target == n) {
            count++;
            return;
        }

        else {
            dfs(target, n + 1);
            dfs(target, n + 2);
            dfs(target, n + 3);
        }
    }
}
