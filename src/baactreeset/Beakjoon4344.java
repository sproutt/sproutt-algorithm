package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4344 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine()
                           .split(" ");

            double sum=0;
            int n = Integer.parseInt(inputs[0]);

            int[] scores = new int[n];
            for (int j = 0; j < inputs.length-1; j++) {
                int score = Integer.parseInt(inputs[j + 1]);
                scores[j] = score;
                sum += score;
            }

            double avg = sum / n;
            double overAvgCount = 0;
            for (int j = 0; j < scores.length; j++) {
                if (avg < scores[j]) {
                    overAvgCount++;
                }
            }
            System.out.printf("%.3f",(overAvgCount/n)*100);
            System.out.print("%");
            System.out.println();
        }
    }
}
