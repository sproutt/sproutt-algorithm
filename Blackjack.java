package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);

        System.out.println(search(numbers, m));
    }

    public static int search(int[] numbers, int m) {
        int result = 0;
        for(int i = 0; i < numbers.length-2; i++) {
            for(int j = i+1; j < numbers.length-1; j++) {
                for(int k = i+2; k < numbers.length; k++) {
                    int sumOfThreeCard = numbers[i] + numbers[j] + numbers[k];

                    if(sumOfThreeCard == m) {
                        return sumOfThreeCard;
                    }

                    if(sumOfThreeCard <= m && sumOfThreeCard > result ) {
                        result = sumOfThreeCard;
                    }
                }
            }
        }
        return result;
    }
}
