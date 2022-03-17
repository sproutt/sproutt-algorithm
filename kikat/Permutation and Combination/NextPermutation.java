package algorithm;

import java.util.Scanner;

public class NextPermutation {
    public static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if(nextPermutation()) {
            for(int i : arr) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("-1");
        }

    }

    private static boolean nextPermutation() {
        int a = arr.length - 1;
        while(a > 0 && arr[a - 1] >= arr[a]) a--;
        if(a <= 0) return false;

        int b = arr.length - 1;
        while(arr[a - 1] >= arr[b]) b--;

        int temp = arr[a - 1];
        arr[a - 1] = arr[b];
        arr[b] = temp;

        int start = a;
        int end = arr.length - 1;
        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return true;
    }
}
