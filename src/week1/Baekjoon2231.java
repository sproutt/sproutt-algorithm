package week1;

import java.util.Scanner;

public class Baekjoon2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int digitSum = 0;
            int number = i;

            while (number != 0) {
                digitSum += number % 10;
                number /= 10;
            }
            if (digitSum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
        scanner.close();
    }
}

