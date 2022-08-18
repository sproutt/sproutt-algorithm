package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon11654 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            // 대문자 이면
            if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {
                arr[input.charAt(i) - 'A']++;
            } else {
                //소문자이면
                arr[input.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 'A');
            } else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
