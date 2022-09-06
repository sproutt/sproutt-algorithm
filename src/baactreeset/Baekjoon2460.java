package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2460 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int off = 0;
        int on = 0;

        int total = 0;

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            off = Integer.parseInt(st.nextToken());
            on = Integer.parseInt(st.nextToken());

            total -= off;
            total += on;

            numbers[i] = total;
        }

        Arrays.sort(numbers);

        System.out.println(numbers[numbers.length-1]);

    }
}
