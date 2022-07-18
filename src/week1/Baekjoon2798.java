package week1;

import java.util.*;

public class Baekjoon2798 {

    public static void main(String[] args) {
        int[] numbers;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n >= 3 && n <= 100) {
            numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }


            if (m >= 10 && n <= 300000) {
                int result = search(numbers, m);
                System.out.println(result);
            }
        }

        scanner.close();
    }

    public static int search(int[] numbers, int m) {
        int sum=0;
        int maxSum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                for (int k = j+1; k < numbers.length; k++) {
                    sum = numbers[i] + numbers[j] + numbers[k];
                    if (sum >= maxSum && sum <= m) {
                        maxSum = sum;
                    }
                }
            }
        }
        return maxSum;
    }
}
