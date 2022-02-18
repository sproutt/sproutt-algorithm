package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseGuGuDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] reverseResults = new int[k];
        int index = 0;

        for (int i = 1; i <= k; i++) {
            int reverseResult = 0;
            int num = n * i;
            while (num != 0) {
                reverseResult = reverseResult * 10 + num % 10;
                num /= 10;
            }
            reverseResults[index++] = reverseResult;
        }

        Arrays.sort(reverseResults);
        System.out.println(reverseResults[k - 1]);
    }
}
