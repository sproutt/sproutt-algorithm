package week2;

import java.util.Scanner;

public class Baekjoon15650 {
    public static int N;
    public static int M;
    public static int[] numbers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        numbers = new int[M];

        backTracking(1, 0);
    }

    public static void backTracking(int at, int depth) {
        if (depth == M) {
            for (int number: numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
            return;
        }

        for (int i = at; i <= N; i++) {

            numbers[depth] = i;
            backTracking(i + 1, depth + 1);
        }
    }
}
