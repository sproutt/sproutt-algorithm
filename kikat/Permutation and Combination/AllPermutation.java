package algorithm;

import java.util.Scanner;

public class AllPermutation {
    public static StringBuilder stringBuilder = new StringBuilder();
    public static int[] arr;
    public static boolean[] isVisited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        arr= new int[n];
        isVisited = new boolean[n];

        dfs(n, 0);
        System.out.println(stringBuilder);
    }

    public static void dfs(int n , int depth) {
        if(depth == n) {
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
                dfs(n, depth + 1);
                isVisited[i] = false;
            }
        }
    }
}
