package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2577 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = 1;

        for (int i = 0; i < 3; i++) {
            value *= Integer.parseInt(br.readLine());
        }

        String strValue = String.valueOf(value);
        int[] arr = new int[10];

        for (int i = 0; i < strValue.length(); i++) {
            arr[strValue.charAt(i)-'0']++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
