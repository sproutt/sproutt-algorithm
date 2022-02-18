package week1;

import java.util.Scanner;

public class Baekjoon1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        String iToString;

        for (int i = 1; i <= N; i++) {
            iToString = String.valueOf(i);
            if (i < 100) {
                count++;
            } else if (i > 100) {
                int initialDiffValue = Character.getNumericValue(iToString.charAt(1)) - Character.getNumericValue(iToString.charAt(0));
                for (int j = 2; j < iToString.length(); j++) {
                    int diffValue = Character.getNumericValue(iToString.charAt(j)) - Character.getNumericValue(iToString.charAt(j-1));
                    if (initialDiffValue != diffValue)
                        break;
                    else {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
