package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon15649 {
    public static int N;
    public static int M;
    public static int[] numberLists;
    public static boolean[] isVisits;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int depth = 0;

        numberLists = new int[M];
        isVisits = new boolean[N];

        backTracking(depth);
    }
    public static void backTracking(int depth) {
        if (depth == M) {
            for (int number : numberLists) {
                System.out.print(number + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isVisits[i]) {
                isVisits[i] = true;
                numberLists[depth] = i + 1;
                backTracking(depth + 1);
                isVisits[i] = false;
            }
        }
    }
}
