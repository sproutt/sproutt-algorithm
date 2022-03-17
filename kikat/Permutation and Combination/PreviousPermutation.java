package algorithm;

import java.util.Scanner;

public class PreviousPermutation {
    public static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if(previousPermutation()) {
            for(int i : arr) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("-1");
        }


    }

    public static boolean previousPermutation() {
        int a = arr.length - 1;
        while(a > 0 && arr[a - 1] <= arr[a]) a--;
        if(a <= 0) {
            return false;
        }

        // a - 1 이랑 그 다음으로 큰 수랑 바뀌어야 함.

        int b = arr.length - 1;
        while(b > 0 && arr[b] >= arr[a - 1]) b--;

        int temp = arr[b];
        arr[b] = arr[a - 1];
        arr[a - 1] = temp;

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
