package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2562 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] numbers = new int[9];
        int[] copies = new int[9];

        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(br.readLine());
            numbers[i] = number;
            copies[i] = number;
        }

        Arrays.sort(numbers);
        int max = numbers[numbers.length - 1];
        sb.append(max)
          .append("\n");

        for (int i = 0; i < numbers.length; i++) {
            if(copies[i] == max) {
                sb.append(i+1).append("\n");
            }
        }

        System.out.println(sb);

    }
}