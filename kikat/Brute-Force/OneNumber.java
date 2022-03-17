package algorithm;

import java.util.Scanner;

public class OneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(count(n));
    }

    public static int count(int n) {
        if (n < 100) {
            return n;
        }

        int first;
        int second;
        int third;
        int count = 99;

        if (n == 1000) {
            count--;
        }

        for (int i = 100; i <= n; i++) {
            first = i % 10;
            second = (i / 10) % 10;
            third = (i / 100) % 10;

            if (first - second == second - third) {
                count++;
            }
        }
        return count;
    }
}


