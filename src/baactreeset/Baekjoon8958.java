package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon8958 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine()
                               .split("");

            int stackCount = 0;
            int sum = 0;
            for (int j = 0; j < inputs.length; j++) {
                if (inputs[j].equals("O")) {
                    stackCount++;
                    sum += stackCount;
                } else {
                    stackCount = 0;
                    sum += stackCount;
                }
            }
            sb.append(sum)
              .append("\n");
        }
        System.out.println(sb);

    }
}
