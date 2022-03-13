package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10974 {
    private static int N;
    private static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        while(allPermutation(numbers)){
            for (int i = 0; i < N; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }

    private static boolean allPermutation(int[] numbers) {
        int i = numbers.length - 1;

        while (i>0 && numbers[i - 1] > numbers[i]) {
            i--;
        }

        if (i <= 0) {
            return false;
        }

        int j = numbers.length - 1;
        while (numbers[i - 1] > numbers[j]) {
            j--;
        }

        int temp = numbers[i-1];
        numbers[i-1] = numbers[j];
        numbers[j] = temp;

        int start = i;
        int end = numbers.length - 1;

        while (start <= end) {
            temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
        return true;
    }
}
