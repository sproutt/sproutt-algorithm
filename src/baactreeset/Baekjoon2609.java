package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2609 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int resultA = 0;
        int resultB = 0;

        for (int i = a; i > 0; i--) {
            if(a % i == 0 && b % i == 0) {
                resultA = i;
                sb.append(resultA + "\n");
                break;
            }
        }

        for (int i = 1; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                resultB = i;
                sb.append(resultB + "\n");
                break;
            }
        }
        System.out.println(sb);
    }
}
