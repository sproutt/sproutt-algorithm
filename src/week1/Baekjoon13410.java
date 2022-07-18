package week1;

import java.util.Scanner;

public class Baekjoon13410 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] arr = new int[K];

        for (int i = 1; i <= K; i++) {
            arr[i-1] = N * i;
        }

        int[] arrReverse = new int[K];

        for (int i = 1; i <= K; i++) {
            String s = String.valueOf(arr[i - 1]);
            char[] sChars = new char[s.length()];

            int index = 0;

            for (int j = s.length() - 1; j >= 0; j--) {
                sChars[index] = s.charAt(j);
                index++;
            }

//            for (int j = 0; j < sChars.length; j++) {
//                System.out.print(sChars[j]);
//            }

            String reverseNumString = "";

            for (int j = 0; j < sChars.length; j++) {
                reverseNumString += sChars[j];
            }
            arrReverse[i - 1] = Integer.parseInt(reverseNumString);
        }

        int max = 0;

        for (int i = 0; i < arrReverse.length; i++) {
            if (max < arrReverse[i]) {
                max = arrReverse[i];
            }
        }
        System.out.println(max);
    }
}