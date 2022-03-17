package algorithm;

import java.util.Scanner;

public class Lotto {
    public static int[] arr;
    public static boolean[] isVisited;
    public static int k;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            k = scanner.nextInt();

            if(k == 0) {
                break;
            }

            arr = new int[k];
            isVisited = new boolean[k];

            for(int i = 0; i < k; i++) {
                arr[i] = scanner.nextInt();
            }
            lotto(0, 0);
            System.out.println();
        }
    }

    public static void lotto(int start, int depth) {
        if(depth == 6) {
            for(int i = 0; i < k; i++) {
                if(isVisited[i]) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            return;
        }

        for(int i = start; i < k; i++) {
            isVisited[i] = true;
            lotto(i + 1, depth + 1);
            isVisited[i] = false;
        }
    }
}
