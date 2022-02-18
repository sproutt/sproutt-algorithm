package week1;

import java.util.Scanner;

public class Baekjoon2858 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt();
        int B = scanner.nextInt();

        int L=0;
        int W=0;

        int calB=0;
        int calR=0;

        boolean on = false;

        for (L = 2; L < R + B; L++) {
            for (W = 2; W < R + B; W++) {
                calB = (W - 2) * (L - 2);
                calR = (W * L) - calB;

                if (calB == B && calR == R) {
                    if (L < W) {
                        int temp;
                        temp = L;
                        L = W;
                        W = temp;
                        System.out.println(L + " " + W);
                        on = true;
                        break;
                    } else {
                        System.out.println(L + " " + W);
                        on = true;
                        break;
                    }
                }
                if (on) {
                    break;
                }
            }
        }
        scanner.close();
    }
}