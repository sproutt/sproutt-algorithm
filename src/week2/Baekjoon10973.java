package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10973 {
    private static int N;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (beforePermutation()) {
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("-1");
        }

    }
    private static boolean beforePermutation() {
        int i = arr.length - 1;

        while (i > 0 && arr[i - 1] < arr[i]) {
            i--;
        }
        if(i<=0) {
            return false;
        }

        int j = arr.length - 1;
        while (arr[i - 1] < arr[j]) {
            j--;
        }
        int temp = arr[i-1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        int start = i;
        int end = arr.length - 1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return true;
    }
}
