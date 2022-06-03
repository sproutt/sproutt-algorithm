package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2108 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] inputs = new int[N];

        double avg;
        int middleValueIndex;

        double total=0;
        for (int i = 0; i < N; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
            total += inputs[i];
        }
        Arrays.sort(inputs);

        int count = 0;
        int max = -1;
        int mod = inputs[0];

        boolean check = false;

        for (int i = 0; i < N - 1; i++) {
            if (inputs[i] == inputs[i + 1]) {
                count++;
            } else {
                count = 0;
            }

            if(max < count) {
                max = count;
                mod = inputs[i];
                check = true;
            } else if (max == count && check) {
                mod = inputs[i];
                check = false;
            }
        }

        avg = Math.round(total / N);
        middleValueIndex = Math.round(N / 2);

        sb.append((int)avg);
        sb.append("\n");
        sb.append(inputs[middleValueIndex]);
        sb.append("\n");
        sb.append(mod);
        sb.append("\n");
        sb.append(inputs[N - 1] - inputs[0]);

        System.out.println(sb);
    }
}
