package algorithm;

import java.util.Scanner;

public class DivideAndMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(searchConstructor(n));
    }

    public static int searchConstructor(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            int temp = i;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            int divideAndSum = sum + i;
            if(n== divideAndSum) {
                return i;
            } else {
                sum = 0;
            }
        }
        return 0;
    }
}
