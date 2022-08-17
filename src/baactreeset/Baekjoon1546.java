package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1546 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] scores = new double[N];
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(scores);
        double max = scores[scores.length - 1];

        double sum = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = scores[i] / max * 100;

            sum += scores[i];
        }

        double avg = sum / scores.length;

        System.out.println(avg);

    }
}
