package baactreeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon14888 {
    private static int N;
    private static int MAX = Integer.MIN_VALUE;
    private static int MIN = Integer.MAX_VALUE;
    private static int[] numbers;
    private static int[] operators = new int[4];


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        numbers = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < operators.length; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        dfs(numbers[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    private static void dfs(int number, int index) {
        if (index == N) {
            MAX = Math.max(number, MAX);
            MIN = Math.min(number, MIN);
        }

        for (int i = 0; i < 4; i++) {
            if(operators[i] > 0) {
                operators[i]--;

                switch (i) {
                    case 0:
                        dfs(number + numbers[index], index + 1);
                        break;
                    case 1:
                        dfs(number - numbers[index], index + 1);
                        break;
                    case 2:
                        dfs(number * numbers[index], index + 1);
                        break;
                    case 3:
                        dfs(number / numbers[index], index + 1);
                        break;
                }
            }
        }
    }
}